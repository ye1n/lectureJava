package enemy;

public class Bomber extends Enemy {
//	private int hp;
//	private double x;
//	private double y;
//	private double speedX;
//	private double speedY;

	public Bomber(int hp, double x, double y, double speedX, double speedY) {
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
//		this.speedX = speedX;
//		this.speedY = speedY;
		super(hp, x, y, speedX, speedY);
	}

//	이동 : 자신의 x,y 값에 speedX, speedY값을 더한다.
//	public void move() {
//		x += speedX;
//		y += speedY;
//	}

	// 폭격개시라는 문구 출력
	public void attack() {
		System.out.println("폭격개시");
	}

//	getter & setter
//	public int getHp() {
//		return hp;
//	}
//
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
//
//	public double getX() {
//		return x;
//	}
//
//	public void setX(double x) {
//		this.x = x;
//	}
//
//	public double getY() {
//		return y;
//	}
//
//	public void setY(double y) {
//		this.y = y;
//	}
//
//	public double getSpeedX() {
//		return speedX;
//	}
//
//	public void setSpeedX(double speedX) {
//		this.speedX = speedX;
//	}
//
//	public double getSpeedY() {
//		return speedY;
//	}
//
//	public void setSpeedY(double speedY) {
//		this.speedY = speedY;
//	}

}
