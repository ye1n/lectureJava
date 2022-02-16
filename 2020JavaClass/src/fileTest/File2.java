package fileTest;

import java.io.File;
import java.io.FileInputStream;

public class File2 {

	// 파일로부터 데이터를 읽어들일때 사용하는 InputStream
	public static void main(String[] args) {
		File file = new File("data/data.txt");
		try {
			// FileInputStream : 파일의 내용을 읽기 위한 입력스트림을 열어주는 역할
			FileInputStream fis = new FileInputStream(file);
			byte[] readBuffer = new byte[10]; // 한번에 10바이트씩 읽어들인다.
			while (fis.read(readBuffer) != -1) {
				System.out.println(readBuffer);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}

}
