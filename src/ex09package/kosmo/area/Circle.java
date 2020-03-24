package ex09package.kosmo.area;

public class Circle {
	
	double rad;
	final double PI;
	
	public Circle(double rad) {
		this.rad = rad;
		PI =3.14159;
	}
	//원의 넓이를 반환하는 멤버메소드
	public double getArea() {
		return PI * rad * rad; 
	}
}
