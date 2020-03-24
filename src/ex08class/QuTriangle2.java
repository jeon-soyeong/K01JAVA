package ex08class;
/*
 밑변과 높이 정보를 저장할 수 있는 Triangle2클래스를 정의해보자. init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.
 ===
 실행결과]
삼각형의 넓이 : 85.0
삼각형의 넓이 : 350.0
 */

class Triangle2{
	
	//멤버변수
	int bottom;//밑변
	int height;//높이
	
	//밑변과 높이를 초기화하는 멤버메소드
	public void init(int bot, int hei) {
		bottom = bot;
		height = hei;
	}
	//삼각형의 넓이를 계산해서 반환하는 멤버메소드
	public double getArea() {
		return bottom * height * 0.5;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
}

public class QuTriangle2 {
	
	public static void main(String[] args) {
		Triangle2 t = new Triangle2();
		t.init(10, 17); //밑변10, 높이17로 초기화 -> 반환타입 x
		System.out.println("삼각형의 넓이 : " + t.getArea());// -> 반환타입 o
		t.setBottom(50);//밑변 50으로 변경 -> 반환타입 x
		t.setHeight(14);//높이 14로 변경 -> 반환타입 x
		System.out.println("삼각형의 넓이 : " + t.getArea());// -> 반환타입 o
	}
}
