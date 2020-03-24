package ex09package.kosmo.perimeter;

public class Circle {
	
	double rad;
	final double PI;
	
	public Circle(double rad) {
		this.rad = rad;
		PI =3.14159;
	}
	//원의 둘레를 계산하는 멤버메소드
	public double getPerimeter() {
		return 2 * PI * rad; 
	}
}
