package ex06array;

public class E05TwoDimArray01 {

	public static void main(String[] args) {
		
		/*
		 아래와 같이 2차원 배열을 초기화하면 세로크기 3, 가로크기 4로
		 설정된다. 초기화할 요소가 없는 부분은 null로 채워지게된다.
		 ※null값 : 아무것도 없는 값을 일컫는다. 즉, 빈값을 말한다.
		 	스페이스와 같은 공백문자와는 다르다는 것에 주의하자.
		 */
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		/*
		 2차원 배열에서 "배열명.length"로 출력하면 세로크기(행)가 반환된다.
		 */
		System.out.println("배열의 세로크기:"+ arr.length);
		System.out.println("배열명이 가진 값 출력(arr)"+ arr);
		
		/*
		 각 행의 가로크기는 초기화된 상태에 따라 다를 수 있다.
		 0행은 2, 2행은 4의 크기를 출력하게 된다. 
		 */
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 크기: %d\n", i, arr[i].length);
			System.out.printf("%d행 출력:%s\n", i, arr[i]);
		}
		
		System.out.println("배열출력하기");
		System.out.println("arr[0][1]="+arr[0][1]);//정상출력
		System.out.println("arr[0][3]="+arr[0][3]);//예외발생
		/*
			 ArrayIndexOutOfBoundsException 예외발생됨
			 즉, 배열의 index를 초과했다는 뜻.
		 */
		
	}

}
