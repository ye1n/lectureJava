package model;

import java.awt.Image;

public class FighterPlane {

	// 속성
	public double speed; // 비행기 속도
	public double bullet_speed; // 탄속도
	public int hp; // 체력
	public Image shapeImage; // 비행기 이미지
	public int x; // x 좌표
	public int y; // y 좌표

	// 기능
	public void moveLeft() {
		x -= speed;
	}

	public void moveRight() {
		x += speed;
	}

	public void moveForward() {
		y += speed;
	}

	public void moveBackward() {
		y -= speed;
	}

	public void fireBullet() {
		// 탄발사 관련 프로그램
	}

	// 생성자 (리턴 타입 X, 생성된 자기 자신이 나옴)
	// 한번에 인스턴스를 만들면서 초기값까지 모두 할당하는 방법
	public FighterPlane(double speed, double bullet_speed, int hp, int x, int y) {
		this.speed = speed;
		this.bullet_speed = bullet_speed;
		this.hp = hp;
		this.x = x;
		this.y = y;
	}

}
