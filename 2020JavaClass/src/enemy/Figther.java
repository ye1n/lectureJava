package enemy;

public class Figther extends Enemy {
	private int ammo;

	public Figther(int hp, double x, double y, double speedX, double speedY, int ammo) {
		super(hp, x, y, speedX, speedY);
		this.ammo = ammo;
	}

	// 보고 : 현재의 x, y 좌표와 방향(speedX, speedY)을 보고한다.
	public void report() {
		System.out.println("현재 위치 : (" + this.x + ", " + this.y + ") 방향 : (" + this.speedX + ", " + this.speedY + ")");
	}

	// 선회 : speedX, speedY값을 받아 해당 값으로 변경해준다
	// 한번 할때마다 hp가 1씩 소모되며 hp가 0이 되면 폭발 메시지를 띄우고 이후 공격명령과 이동명령이 메시지를 띄우고 실행되지 않는다.
	public void spin(double speedX, double speedY) {
		hp--;
		this.speedX = speedX;
		this.speedY = speedY;
		if (hp <= 0) {
			System.out.println("폭발");
		}
	}

	// 공격 : 공격메시지의 함께 탄약수가 1 소모된다.
	public void attack() {
		if (hp <= 0) {
			System.out.println("폭발하여 공격불가");
		} else {
			ammo--;
			System.out.println("공격");
		}
	}

	// 오버라이드
	public void move() {
		if (hp <= 0) {
			System.out.println("파괴되어 이동불가");
		} else {
			x += speedX;
			y += speedY;
		}
	}

	// getter & setter

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

}
