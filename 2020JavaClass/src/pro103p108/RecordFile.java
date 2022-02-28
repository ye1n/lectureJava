package pro103p108;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RecordFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("기록할 파일명을 입력하세요");
		File file = new File(in.nextLine());

		try {
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);

			System.out.println("문장을 입력하세요. 공백 입력시 종료됩니다.");
			while (true) {
				String line = in.nextLine();

				if (line.isEmpty()) {
					System.out.println("종료");
					break;
				}
				bw.write(line);
				bw.newLine();
			}

			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}

	}

}
