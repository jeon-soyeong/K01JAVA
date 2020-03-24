package ex12inheritance;
/*
 다음 Point클래스를 이용하여 다음 문제를 해결하시오.
 해당 문제는 상속을 통해 구현하는 것이 아니라 구성관계를 이용하여 해결한다.
 Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.
 그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
=======
실행결과]
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]
 */

class Point{
	
   	int xDot, yDot;
   	
   	public Point(int x, int y){
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo(){
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;

	//생성자
	/*
	 반지름을 표현하는 radian과 중심좌표를 표현한 Point객체 생성
	 Point객체 생성을 위해서는 2개의 인자가 필요함.
	 */
	
	public Circle(int x, int y, int r) {
		radian = r;
		center = new Point(x, y);
	}
	
	public void showCircleInfo() {
		System.out.println("반지름:"+radian);
		/*
		 원의 중심좌표 정보출력. 상속관계가 아니므로 객체를 이용해서
		 멤버메소드를 호출한다.
		 */
		center.showPointInfo();
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원

	//생성자
	/*
	 멤버변수인 2개의 Circle클래스의 객체를 생성한다.
	 */
	public Ring(int inX, int inY, int inR,
			int outX, int outY, int outR) {
		innerCircle = new Circle(inX, inY, inR);
		outerCircle =  new Circle(outX, outY, outR);
	}
	
	/*
	 링의 정보를 출력하기 위해 2개의 원의 멤버메소드를 호출
	 */
	public void showRingInfo() {
		System.out.println("안쪽원");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원");
		outerCircle.showCircleInfo();
	}
}
public class QuRingMake {
	public static void main(String[] args) {
		
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
		
	}
}



