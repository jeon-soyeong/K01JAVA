package ex13interface.figure;

//※인터페이스 하나당 하나의 자바파일을 구성하는 것을 권고하고 있음

//인자로 전달되는 도형의 넓이를 구하는 추상메소드
public interface IFigure {
	void area(String figureName);
}
