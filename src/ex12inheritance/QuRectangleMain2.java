package ex12inheritance;
/*
 정사각형을 의미하는 Square2클래스와 직사각형을 의미하는 Rectangle2클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오. 
 =======
실행결과]
직사각형 면적: 12
정사각형 면적: 49
 */

	//직사각형을 표현한 클래스
class Rectangle2{
		
		int width;//가로
		int height;//세로
		
	//인자생성자	
	public Rectangle2(int w, int h) {
		this.width = w;
		this.height = h;
	}
	void ShowAreaInfo() {
		System.out.println("직사각형 면적:"+(width*height));
	}
} 
	
	//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square2 extends Rectangle2{
	//멤버변수 : 확장없음
	/*
	 부모클래스에서 이미 가로, 세로 길이가 정의되어 있으므로 추가적인
	 멤버변수의 정의는 불필요하다.
	 */
	
	//생성자
	/*
	 정사각형은 가로, 세로 길이가 동일하므로 인자값 1개로 
	 부모의 멤버변수 2개를 동시에 초기화한다.
	 */
	public Square2(int w) {
		super(w,w);
	}
	
	/*
	넓이를 구하는 공식은 동일하나 부모는 직사각형, 자식은 정사각형의
	면적을 출력해야 하므로 오버라이딩 해야한다.
	 */
	@Override
	void ShowAreaInfo() {
		System.out.println("정사각형 면적:"
				+(width*height));
	}
} 
	
public class QuRectangleMain2{
		
	public static void main(String[] args){
			
       	Rectangle2 rec = new Rectangle2(4, 3);
       	rec.ShowAreaInfo();
 
       	Square2 sqr = new Square2(7);
       	sqr.ShowAreaInfo();
   	}
}


