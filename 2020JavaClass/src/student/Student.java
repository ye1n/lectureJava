package student;

public class Student extends Human {

	// 공부하기 : 자신의 국어, 수학, 영어 성적을 1점씩 올려준다. 단, 입력된 성적이 없는경우 1로 입력
	public void study() {
		if(kor == 0) kor = 1; else kor ++;
		if(math == 0) math = 1; else math ++;
		if(eng == 0) eng = 1; else eng ++;
	}

	// 성적 발표 : 국어, 수학, 영어 성적을 출력한다. 단, 입력된 성적이 없는경우 "없음" 출력
	public void grade() {
		if(kor == 0) System.out.println("국어 성적 : 없음");
		else System.out.println("국어 성적 : " + this.kor);
		if(math == 0) System.out.println("수학 성적 : 없음");
		else System.out.println("수학 성적 : " + this.math);
		if(eng == 0) System.out.println("영어 성적 : 없음");
		else System.out.println("영어 성적 : " + this.eng);
	}

	// 자기소개 : 이름, 나이, 학번 출력
	public void introduce() {
		System.out.println(this.name + " " + this.age + "세 " + this.code);
	}
}
