package ex15usefulClass;

class MyClass{
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	/*
	toString() : 실제 저장된 데이터가 반환되도록 Object클래스로부터
		상속받아 오버라이딩한 메소드
	 */
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	/*
	MyClass형의 객체의 비교를 위해 오버라이딩한 메소드.
	객체가 가지고 있는 멤버변수의 비교를 통해 동일여부를 판단한다.
	 */
	@Override
	public boolean equals(Object obj) {
		/*
		 매개변수로 전달된 객체를 Object로 받은 후 MyClass의 인스턴스인지
		 먼저 판단한다. 
		 */
		if(obj instanceof MyClass) {
			//MyClass형으로 다운캐스팅
			MyClass mc = (MyClass)obj;
			//두 객체의 멤버변수의 값을 실제로 비교함
			if(mc.data == this.data) {
				return true;//값이 동일할 때 true
			}
			else {
				return false;//다를 때 false
			}
		}
		else {
			/*
			 매개변수로 전달된 객체가 MyClass의 인스턴스가 아니라면
			 비교의 대상이 될 수 없으므로 false를 반환함
			 */
			return false;
		}
	}
}

class Point{
	
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	객체1,2의 x,y값을 동시에 비교해서 둘 다 동일할 때 같은 객체로
	판단하도록 오버라이딩 처리
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point pos = (Point)obj;
			if(this.x==pos.x && this.y==pos.y) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "x="+String.valueOf(x)+", y="+String.valueOf(y);
	}
}

public class E04Object3Equals {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("[두 객체를 equals()메소드로 비교]");
		
		//두 객체의 참조값(주소값)에 대한 비교
		if(mc1==mc2) {
			System.out.println("인스터스 참조값(주소값)이 같다");
		}
		else {
			System.out.println("인스터스 참조값(주소값)이 다르다");//[0]
		}
		
		//두 객체의 멤버변수값 비교
		System.out.println(mc1.equals(mc2) ? "같다" : "다르다");//[같다]
		
		//toString()메소드에 오버라이딩 한 내용를 출력
		System.out.println("[두 객체의 toString()메소드 호출]");
		System.out.println("mc1.toString()=>"+mc1.toString());
		System.out.println("mc2=>"+mc2);
		
		Point pos1 = new Point(10, 20);
		Point pos2 = new Point(10, 30);
		System.out.println("두 점의 비교결과:");
		System.out.println(pos1.equals(pos2)? "같다" : "다르다");
		
		/*
		 아래 toString()메소드는 굳이 호출하지 않아도 print()문이
		 실행될 때 자동으로 호출하므로, 아래 출력결과는 동일하다.
		 */
		System.out.println("pos1.toString()=>"+pos1.toString());
		System.out.println("pos2.toString()=>"+pos2.toString());
		System.out.println(pos1);
		System.out.println(pos2);
	}
}
