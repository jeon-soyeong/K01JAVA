package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {
		
		/*
		 세로크기 3, 가로크기 4인 2차원 배열 선언.
		 */
		int [][] arr2Dim= new int[3][4];
		
		/*
		 가로, 세로 크기만큼 반복하면서 초기화진행.
		 */
		for(int i=0; i<3; i++) {
			for(int j =0; j<4; j++) {
				arr2Dim[i][j] = i+j;
			}
		}
		/*
		 초기화된 데이터를 출력.
		 */
		for(int n=0; n<arr2Dim.length; n++) {//배열의 세로길이(행)
			for(int m =0; m<arr2Dim[n].length; m++) {//배열의 가로길이(열)
				System.out.print(arr2Dim[n][m]+" ");
			}
			System.out.println();
		}
		
		/*
		시나리오] 다음 절차에 따라 프로그램을 작성하시오.
		1. 2차원 배열을 선언한다. 세로2, 가로4
		2. 난수를 이용하여 배열을 초기화한다. (0~100사이)
		3. 배열전체요소를 매개변수로 전달된 정수만큼
			증가시킨다.
		4. 증가되기 전, 후 배열을 출력한다.
		5. 다음 메소드명으로 구현한다. twoDimPlus()
		 */	
		
		//세로 2, 가로 4인 2차원 배열 선언
		int[][] twoArray = new int[2][4];
		//세로크기만큼 반복(배열명을 이용함)
		for(int i=0; i<twoArray.length; i++) {
			//가로크기만큼 반복(배열명[인덱스]를 이용해 각 행의 크기를 가져옴)
			for(int j=0; j<twoArray[i].length; j++) {
				//난수를 이용해서 각 요소를 초기화
				twoArray[i][j]=(int)(Math.random()*100);
			}
		}
		
		System.out.println("=초기화 후=======================");
		showArray(twoArray);
		
		/*
		 배열의 각 요소값을 전달한 매개변수만큼 증가시킴. 여기서는 10만큼 증가.
		 */
		twoDimPlus(twoArray,10);
		
		System.out.println("=메소드 호출 후===================");
		showArray(twoArray);
		
	}
		
		/*
		 배열을 출력하는 부분이 중복되기 때문에 이런 경우 메소드를
		 생성하여 호출해 주는 것이 좋다.
		 */
		static void showArray(int [][] arr2) {
			for(int i=0; i<arr2.length; i++) {
				for (int j=0; j<arr2[i].length; j++) {
					System.out.printf("%-4d", arr2[i][j]);
				}
				System.out.println();
			}
		}
	
		static void twoDimPlus(int [][] arr2, int plusNum) {
			for(int i=0; i<arr2.length; i++) {
				for (int j=0; j<arr2[i].length; j++) {
					/*
					 매개변수로 전달된 plusNum 만큼 각 요소를 증가시킴.
					 */
					arr2[i][j] += plusNum;
				}
			}
		}
		
		
}
