package ex13interface.figure;

/*
 두개의 인터페이스를 동시에 구현하고 있다.
 여러개를 구분할 때는 콤마로 구분하면 된다.
 */
public class Circle implements IFigure, IDrawable {
	
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	/*
	인터페이스에 정의된 추상메소드를 필수로 오버라이딩해야 한다.
	 */
	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다");
	}
	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적(r*r*PI):"+
				radius*radius*Math.PI);
	}
}
