package student;

// 부모 클래스
public abstract class Human {
	// 모든 변수는 protected로 선언되어야 한다.
	protected String name; // 이름
	protected int age; // 나이
	protected String major; // 전공
	protected String code; // 학번
	protected double kor; // 국어 성적
	protected double math; // 수학 성적
	protected double eng; // 영어 성적

	// 자기소개 매서드는 반드시 추상 클래스로 만들어야 한다.
	abstract public void introduce();

	// 다른 패키지에서도 사용 가능 하도록 getter와 setter를 가지고 있어야 한다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getKor() {
		return kor;
	}

	public void setKor(double kor) {
		this.kor = kor;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}
	
}
