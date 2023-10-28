package function;
class Area{
	void area(int l) {
		System.out.println("Area of Square: "+l*l);
	}
	void area(int l,int b) {
		System.out.println("Area of Rectangle: "+l*b);
	}
	void area(int base , float height) {
		System.out.println("Area of triangle: "+0.5*base*height);
	}
	void area(double radius) {
		System.out.println("Area of Square: "+3.14*radius*radius);
	}
}

public class AreaEx {


			public static void main(String[] args) {
				Area a = new Area();
				a.area(8);
				a.area(7, 6);
				a.area(5, 3.2f);
				a.area(9);
			}

}
