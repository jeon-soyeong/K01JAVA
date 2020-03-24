package ex12inheritance;

public class DeParent {
	
	private String name;
	private int age;
	
	public DeParent() {}
	public DeParent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//getter()메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	/*
	 멤버메소드 정의
	 -4가지의 접근지정자를 사용하여 정의한 멤버메소드
	 */
	private void eat() {
		System.out.println("부모님이 드신다");
	}
	String sleep() {
		System.out.println("부모님이 주무신다");
		return null;
	}
	protected void walk() {
		System.out.println("부모님이 산책하신다");
	}
	public void excercise() {
		System.out.println("부모님이 운동하신다");
	}
	
	//정보출력용 메소드
	public void printParents() {
		System.out.printf("성함:%s, 연세:%d", name, age);
	}
	//정적메소드 정의
	public static void staticMethod() {
		System.out.println("부모님의 정적메소드");
	}
}
