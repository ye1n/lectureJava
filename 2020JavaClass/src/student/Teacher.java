package student;

public class Teacher extends Human {
	
	// 자기소개 : 이름, 나이, 전공 출력
	public void introduce() {
		System.out.println(this.name + " " + this.age + "세 " + this.major + " 전공");
	}

	// 수업준비 : 이름과 전공과 준비문구를 출력한다.
	public void ready() {
		System.out.println(this.name + " : " + this.major + " 수업 준비 중 입니다.");
	}
}
