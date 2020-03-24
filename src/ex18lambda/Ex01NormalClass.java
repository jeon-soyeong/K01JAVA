package ex18lambda;

/*
일반적인 인터페이스와 클래스를 활용한 오버라이딩
*/
interface IKosmo1{
	/*
	 인터페이스에 정의된 메소드는  public abstract로 선언된다.
	 */
	void studyLambda(String str);
}
class KosmoStudent1 implements IKosmo1{
	//인터페이스를 구현 받았으므로 반드시 추상메소드를 오버라이딩해야 한다.
	@Override
	public void studyLambda(String str) {
		System.out.println(str+"을(를) 공부합니다.");
	}
}

public class Ex01NormalClass {

	public static void main(String[] args) {
		/*
		 단지 메소드 하나를 정의해서 사용하고 싶은데 인터페이스, 상속,
		 오버라이딩, 객체생성까지의 과정을 거쳐야 한다. 과정이 너무
		 복잡하다. 
		 */
		IKosmo1 kosmo = new KosmoStudent1();
		kosmo.studyLambda("람다식");
	}
}