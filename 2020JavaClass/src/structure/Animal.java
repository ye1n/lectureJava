package structure;

public abstract class Animal {
	// protected : 같은 패키지에 있는 모든 클래스들은 제한 없이 사용이 가능
	protected String name;

	public void introduce() {
		System.out.println("저의 이름은 " + this.name);
	}

	// 추상 메서드 : 부모클래스에는 필요없지만 자식 클래스에는 반드시 구현해야하는 것이 있다면
	// 부모클래스에서 그것을 명시적으로 지정한다.
	abstract public void breath();

	// 다른 패키지에 있는 Main에서 protected에 의해서 감춰진 멤버변수 name을 사용할 수 있게 수정
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
