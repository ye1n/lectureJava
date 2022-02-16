package fileTest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class File5 {

	// 그림파일을 일반적인 입력스트림만을 사용해 읽어왔을때와, 보조스트림을 추가해서 썼을 때의 성능 차이를 비교해보자.
	public static void main(String[] args) {
		File file = new File("data/a.jpg");
		long start = 0;
		long end = 0;
		try {
			// 일반적인 입력 스트림만을 사용
			FileInputStream fis1 = new FileInputStream(file);

			start = System.currentTimeMillis(); // 현재 시간 측정
			while (fis1.read() != -1) {
				// 아무것도 하지 않고 계속 읽어들이기만 한다.
			}
			end = System.currentTimeMillis(); // 종료 시간 측정
			fis1.close();
			System.out.println("미사용시 : " + (end - start) + "ms 소요");

			// 보조스트림 추가해서 사용
			FileInputStream fis2 = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis2);

			start = System.currentTimeMillis(); // 현재 시간 측정
			while (bis.read() != -1) {
				// 아무것도 하지 않고 계속 읽어들이기만 한다.
			}
			end = System.currentTimeMillis(); // 종료 시간 측정
			System.out.println("사용시 : " + (end - start) + "ms 소요");
			bis.close();
			fis2.close();

		} catch (Exception e) {
			System.out.println("파일 처리 에러");
		}
	}
}
