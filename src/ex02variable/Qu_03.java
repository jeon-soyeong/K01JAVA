package ex02variable;
/*
 반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
 area      radius
	원의넓이 = 반지름 * 반지름 * 3.14
 */
public class Qu_03 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		int radius = 10;
		
//		int area_int = radius * radius * (int)PI;
//		float area_float = radius * radius * (float)PI;
//		double area_double = radius * radius * PI;

		int area_int =(int) (radius * radius * PI);
		float area_float = (float)(radius * radius * PI);
		double area_double = (radius * radius * PI);//double이므로 형변환 x 상관없음
		
		System.out.println("area_int:" + area_int);
		System.out.println("area_float:" + area_float);
		System.out.println("area_double:" + area_double);
				
	}

}
