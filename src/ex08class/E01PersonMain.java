package ex08class;

/*
 추상화 : 현실세계의 사물을 클래스로 형상화 하는 것을
 	추상화라고 한다. Person 클래스는 "사람"의
 	일반적인 사항을 추상화하고 있다.
 */
class Person{
	
	/*
	 멤버 변수 : 클래스를 정의할 때 객체의 속성값(데이터)을 표현할 때
	 사용한다. 해당 클래스 내 정의된 멤버 메소드에서는 별다른
	 선언 혹은 전달없이 직접 접근이 가능하다.
	 */
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	/*
	 멤버 메소드 : 클래스에서 객체의 동작(행위)를 표현한다.
 		클래스 외부에서 호출할 때는 객체의 참조변수를 통해서
 		호출해야 한다.
	 */
	void eat() {
		System.out.printf("%s가(이) 식사를 한다.\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s가(이) 잠자고 있다\n",
				age, name);
	}
}

public class E01PersonMain {

	public static void main(String[] args) {
		
		/*
		 Person클래스를 통해 인스턴스(객체)를 생성한다.
		 생성 시 할당된 주소값이 반환된다.
		 */
		Person person = new Person();
		
		//객체의 참조변수를 이용하여 멤버메소드를 호출한다.
		person.eat();
		person.sleep();
	}

}
