package enemy;

public class MainApp {
	public static void main(String[] args) {
//		과제 3번
//		Bomber b = new Bomber(10, 8.4, 9.7, 10, 10);
//
//		b.move();
//		b.move();
//
//		System.out.println(b.getX() + ", " + b.getY());
//		b.attack();
//
//		Scouter s = new Scouter(10, 45.3, 80.2, 5, 50);
//		System.out.println(s.getX() + ", " + s.getY());
//		s.scan();

//		 과제 4-5번
		Figther f = new Figther(3, 50, 50, 3, 4, 10);

		f.report();
		f.move();
		f.report();

		System.out.println(f.getAmmo());
		f.attack();
		System.out.println(f.getAmmo());

		f.spin(10, 10);
		f.report();
		f.spin(4, 3);
		f.move();
		f.spin(7, 2);
		f.report();
		f.move();

		f.attack();
		System.out.println(f.getAmmo());

	}
}
