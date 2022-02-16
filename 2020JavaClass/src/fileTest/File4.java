package fileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File4 {

	// 사용자로부터 복사를 원하는 파일의 이름을 입력받고, 해당 이름의 파일이 존재하는지 검사 후 해당 파일이 없을경우에는 오류 메시지를 띄우고
	// 다시 입력받는다.
	// 추가 과제 : 원본 파일에서 제시된 파일로 파일의 복사가 이루어질 수 있도록 코드 작성
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("복사할 파일 이름을 입력하세요. (파일은 data 폴더에 안에 있어야 합니다.)");

		String sourceFilename = "";
		File sFile;
		String destFilename = "";
		File dFile;

		// 사용자가 존재하는 이름의 복사할 파일명을 입력할때까지 반복
		while (true) {
			sourceFilename = in.nextLine(); // 복사할 파일 이름 입력받음.
			sFile = new File("data/" + sourceFilename);

			// 복사할 파일이 존재하는지 검사하는 부분
			if (sFile.exists()) {
				break; // 해당 파일이 존재한다면 루프를 벗어남.
			} else {
				System.out.println("파일이 존재하지 않습니다.");
			}
		}

		System.out.println("복사될 파일의 이름을 입력하세요.");
		destFilename = in.nextLine(); // 복사될 파일 이름 입력받음.
		dFile = new File("data/" + destFilename);

		in.close(); // 스캐너 자원의 반환

		try {
			FileInputStream fis = new FileInputStream(sFile);
			FileOutputStream fos = new FileOutputStream(dFile);

			// 파일 복사 코드
			byte[] Buffer = new byte[100];
//			while(fis.read(Buffer) != -1) {
//				fos.write(Buffer);
//			}
			while (true) {
				if (fis.read(Buffer) == -1) {
					break;
				}
				fos.write(Buffer);
			}
			System.out.println("파일 복사가 완료되었습니다.");

			// 사용한 자원들의 반환
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
	}
}
