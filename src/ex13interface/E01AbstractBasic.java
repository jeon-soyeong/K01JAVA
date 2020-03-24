package ex13interface;

/*
 추상클래스1 - 추상메소드를 포함하지 않는 추상클래스
 */
abstract class AbsClass1{
	//int형으로 표현할 수 있는  최대값을 반환하는 Wrapper클래스
	public static final int MAX_INT =Integer.MAX_VALUE;
	
	int instanceVar;
	static int staticVar;
	
	void instanceMethod() {}
	static void staticMethod() {}
}

class AbsClassChild1 extends AbsClass1{
	//자식클래스에서 확장한 변수와 메소드
	int newVar;
	void newMethod() {
	}
	/*
	추상메소드를 포함하지 않은 추상클래스를 상속하면 오버라이딩은
	강제사항이 아니다. 필요한 경우에만 오버라이딩 한다.
	 */
	@Override
	void instanceMethod() {
		System.out.println("필요없다면 오버라이딩 하지 않아도 상관없다.");
	}
}

/*
 추상클래스2 -  추상메소드를 포함한 클래스
 	추상메소드를 멤버로 포함한 클래스는 반드시 abstract로 
 	정의해야한다. class앞에 abstract를 지우면 에러가 발생한다.
 */
abstract class absClass2{
	abstract void absMethod(int number);
}
/*
 	부모가 가진 추상메소드를 그대로 상속받게 되므로 에러가 나지
 	않으려면 해당클래스도 abstract로 선언하거나,
 	부모의 abstract메소드를 오버라이딩 처리해야 한다.
 */
class absClassChild2 extends absClass2{
	
	@Override
	void absMethod(int number) {
		System.out.println("부모클래스에서 오버라이딩한 메소드 없을 땐 에러발생함");
	}
	
	void newMethod() {
		System.out.println("자식클래스에서 새롭게 확장한 메소드");
	}
}

public class E01AbstractBasic {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스를 생성할 수 없다.
//		AbsClass1 absClass1 = new AbsClass1(); //에러발생
		
		//추상클래스를 상속한 하위클래스는 객체생성이 가능하다.
		AbsClassChild1 absClassChild1 = new AbsClassChild1();		
		
		/*
		 추상클래스로 인스턴스 생성은 할 수 없지만, 참조변수로 
		 사용하는 것은 가능하다.
		 */
		absClass2 absClass2 = new absClassChild2();
		absClass2.absMethod(100);
		((absClassChild2)absClass2).newMethod();/*
			부모타입의 참조변수로 자식객체에 접근하려면
			다운캐스팅(강제형변환) 후 접근해야 한다.
		*/
		
		/*
		 추상클래스내에 선언된 정적멤버는 오버라이딩의 대상이 
		 될 수 없으므로 static이 가진 기본규칙을 따른다.
		 */
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
	}
}
