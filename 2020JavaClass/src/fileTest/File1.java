package fileTest;

import java.io.File;

public class File1 {
	public static void main(String[] args) {
		File file1 = new File("data/data.txt");
		File file2 = new File("data/a.txt");
		if (file1.exists()) { // 해당 파일 존재 여부 true/false 반환
			System.out.println("해당 파일이 존재합니다.");
		}
		try {
			file2.createNewFile(); // 파일 생성
			System.out.println("성공적으로 파일이 생성되었습니다.");
		} catch (Exception e) {
			System.out.println("파일 생성에 실패했습니다.");
		}
	}
}
