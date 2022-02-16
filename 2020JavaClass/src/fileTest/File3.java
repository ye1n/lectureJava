package fileTest;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File3 {

	// 파일의 내용을 작성할 수 있는 FileOutputStream
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("저장할 파일 명을 입력하세요.");
		String filename = in.nextLine();
		File file = new File("data/" + filename); // 입력받은 파일명으로 새 파일 생성

		try {

			FileOutputStream fos = new FileOutputStream(file);

			while (true) {
				String data = in.nextLine();

				if (data.isEmpty()) { // 입력한 내용이 없다면
					break;
				}
				data += "\n"; // 엔터가 쳐진 상태로 입력 받기 위한 문자
				fos.write(data.getBytes());
			}
			fos.close();
			System.out.println("파일 기록이 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 쓰기 실패");
		}

	}

}
