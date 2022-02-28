package student;

public class MainApp {
	public static void main(String[] args) {
		
		// student
		Student stu = new Student();
		stu.setName("우예인");
		stu.setAge(18);
		stu.setCode("20604");

		stu.introduce();
		stu.setKor(80.0);
		stu.grade();
		stu.study();
		stu.grade();

		// teacher
		Teacher tea = new Teacher();
		tea.setName("최선한");
		tea.setAge(30);
		tea.setMajor("프로그래밍");

		tea.introduce();
		tea.ready();
	}
}
