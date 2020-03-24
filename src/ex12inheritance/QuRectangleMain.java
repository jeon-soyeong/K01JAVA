package ex12inheritance;
/*
 정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오. 
 =======
실행결과]
직사각형 면적: 12
정사각형 면적: 49
 */

	//직사각형을 표현한 클래스
class Rectangle{
		
		int x;
		int y;
		
	public Rectangle() {}
		
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void ShowAreaInfo() {
		System.out.println("직사각형 면적: "+(x*y));
	}
} 
	
	//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
	
	int z;
	
	public Square(int z) {
		this.z = z;
	}
	public Square(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	void ShowAreaInfo() {
		System.out.println("정사각형 면적: "+(z*z));
	}
} 
	
public class QuRectangleMain{
		
	public static void main(String[] args){
			
       	Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
 
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();
   	}
}


