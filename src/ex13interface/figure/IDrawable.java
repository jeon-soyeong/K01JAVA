package ex13interface.figure;

//그리는 행위를 표현한 인터페이스
public interface IDrawable {
	//인자로 전달되는 도형을 그리는 것을 의미하는 추상메소드
	void draw(String figureName);
}
