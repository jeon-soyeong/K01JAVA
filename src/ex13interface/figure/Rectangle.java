package ex13interface.figure;

public class Rectangle extends FigureData implements IFigure, IDrawable{
	
	/*
	 생성자에서 부모생성자를 호출하여 가로, 세로 길이를 초기화
	 */
	public Rectangle(int width, int height) {
		super(width,height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다");
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적(가로*세로):"+
				width*height);
	}
}
