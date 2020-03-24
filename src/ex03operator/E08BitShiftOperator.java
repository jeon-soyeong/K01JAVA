package ex03operator;

public class E08BitShiftOperator {

	/*
	 비트 시프트 연산자
	 	: 자료의 비트단위로 좌측 혹은 우측으로 이동시키는 연산자로
	 	빈 부분은 0으로 채워준다. 
	 	좌측으로 이동하면 2배씩 증가하고, 우측으로 이동하면 2배씩
	 	감소하게 된다.
	 */
	public static void main(String[] args) {
		
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println("===========");
		
		int num =8;
		int sh1 = 1, sh2 = 2, sh3 = 3, sh4 = 4, sh5 = 5;
		System.out.println("Right shift 연산자");
		System.out.println(num >> sh1);//4
		System.out.println(num >> sh2);//2
		System.out.println(num >> sh3);//1
		System.out.println(num >> sh4);//0
		System.out.println(num >> sh5);//0
		System.out.println("===========");
		System.out.println(num >>> sh1);//4
		System.out.println(num >>> sh2);//2
		System.out.println(num >>> sh3);//1
		System.out.println(num >>> sh4);//0
		System.out.println(num >>> sh5);//0
		System.out.println("===========");
		System.out.println("Left shift 연산자");
		System.out.println(num << sh1);//16
		System.out.println(num << sh2);//32
		System.out.println(num << sh3);//64
		System.out.println(num << sh4);//128
		System.out.println(num << sh5);//256
		System.out.println("===========");
		
	}

}
