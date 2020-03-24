package ex12inheritance;

public class DeChild extends DeParent {
	//멤버변수 : 자식에서 확장한 변수
	String stNumber;//학번을 표현
	
	//인자생성자
	public DeChild(String name, int age, String stNumber) {
		//부모의 인자생성자 호출
		super(name, age);
		this.stNumber = stNumber;
	}
	
	//자식에서 새롭게 확장한 멤버메소드
	public void study() {
		System.out.println(getName() + "이(가) 공부한다.");
	}
	
	/*
	 오버라이딩 아님.
	 부모클래스에서 private 멤버메소드로 선언되었기 때문에
	 자식에서는 보이지 않으므로 오버라이딩의 대상이 될 수 없다.
	 해당 함수는 자식에서 새롭게 확장한 메소드가 된다.
	 */
	private void eat() {
		System.out.println("학생이 먹는다.");
	}
	/*
	메소드 오버라이딩의 조건
	-부모클래스에서 선언될 때와 비교해서 접근범위가
	동일하거나 그보다 넓으면 가능하다.
	-즉 부모에서 default일 때 자식 쪽에서 default,
	public이면 오버라이딩이 가능하다.
	 */
	@Override
	public String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	
	/*
	 메소드의 형태가 다르므로 오버라이딩이 아님.
	 오버로딩의 형태로 자식에서 확장한 메소드가 된다.
	 */
	public int walk(int age) {
		System.out.println("나이가 "+age +"살인 학생이 "
				+"산책한다.");
		return 0;
	}
	
	//오버라이딩 정의
	@Override
	public void excercise() {
		//super.excercise();
		System.out.println("학생이 운동한다.");
	}
	/*
	오버라이딩 정의
	
	super() : 부모클래스의 생성자 메소드 호출
	super.멤버 : 부모클래스에서 정의된 멤버변수 혹은 멤버메소드를
		호출할 때 사용
	 */
	@Override
	public void printParents() {
		super.printParents();
		System.out.printf(", 학번:%s\n", stNumber);
	}
	/*
	 static(정적)메소드는 오버라이딩이 불가능하다.
	 클래스 외부(메소드 영역)에 존재하므로 오버라이딩의
	 대상이 될 수 없다.
	 */
	public static void staticMethod() {
		System.out.println("학생의 정적메소드");
	}
}
