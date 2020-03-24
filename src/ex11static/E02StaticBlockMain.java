package ex11static;

public class E02StaticBlockMain {

	public static void main(String[] args) {
		
		System.out.println("static블럭 - 다른 클래스의 메인 메소드");
		StaticBlock sb = new StaticBlock();
		System.out.println("StaticBlock.staticVar="
				+StaticBlock.staticVar);
	}
}
