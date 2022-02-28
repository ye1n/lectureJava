package enemy;

public class Enemy {
	protected int hp;
	protected double x;
	protected double y;
	protected double speedX;
	protected double speedY;

	public Enemy(int hp, double x, double y, double speedX, double speedY) {
		this.hp = hp;
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
	}

	public void move() {
		x += speedX;
		y += speedY;
	}
}
