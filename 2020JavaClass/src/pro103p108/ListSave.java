package pro103p108;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ListSave {

	// 리스트에 있는 아이템 파일로 저장하기
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("쯔위");
		list.add("지효");
		list.add("다현");
		list.add("사나");
		list.add("나연");

		File savaFile = new File("data.txt");

		try {
			FileOutputStream fos = new FileOutputStream(savaFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);

			for (String item : list) {
				bw.write(item);
				bw.newLine();
			}
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("기록 중 오류 발생");
		}
	}
}
