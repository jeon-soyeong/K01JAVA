package ex13interface.figure;

public class Triangle extends FigureData implements IFigure, IDrawable{
	
	/*
	 생성자에서 부모생성자를 호출하여 밑변, 높이 길이를 초기화
	 */
	public Triangle(int width, int height) {
		super(width,height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을(를) 그려봅니다");
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적은(가로*세로*0.5):"+
				(width*height*0.5));
	}
}
