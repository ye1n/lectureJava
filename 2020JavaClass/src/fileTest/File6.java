package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class File6 {

	// 파일을 읽어오기 더 편하게 해주는 Reader와 BufferedReader
	// 추가 과제 : data.txt로부터 읽어들인 것을 String 형태의 ArrayList에 저장후, 이를 한줄씩 출력하는 프로그램 작성
	// ArrayList에 저장된 것을 다시 result.txt에 옮겨 담는다.
	// FileOutputStream을 통해 파일 출력 스트림을 열고, 동일하게 OutputStreamWriter를 만들고 이것을 BufferedWriter로 보조스트림을 달아서 작성한다.
	public static void main(String[] args) {
		File file = new File("data/data.txt");
		ArrayList<String> arr = new ArrayList<>();

		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				arr.add(line);
			}
			// 한줄씩 출력
			for (String line : arr) {
				System.out.println(line);
			}

			File outFile = new File("data/result.txt");
			FileOutputStream fos = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);

			for (String line : arr) {
				bw.write(line);
				bw.newLine();
			}

			bw.flush(); // 버퍼에만 썼기 때문에 이걸 해주지 않으면 실제 쓰여지지 않는다.

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}

}
