package quiz_game;

import java.util.Random;

public class BubbleSort {

	public void bubbleSort(int [] countArray){
		
		int temp;
		for(int i = 0; i < countArray.length-1; i++){
			for(int j = 0; j < countArray.length-1; j++){
				if(countArray[j] > countArray [j+1]){
				temp = countArray[j];
				countArray[j] = countArray[j+1];
				countArray[j+1] = temp;
				}
				showArray(countArray);
				System.out.println();
			}
			System.out.println("======");
		}
	}
	
	public void showArray(int [] countArray){
		for (int i = 0; i < countArray.length; i++) {
			System.out.print(countArray[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		int [] countArray = new int[10];
		Random random = new Random();
		
		for(int i = 0; i < countArray.length; i++){
			countArray[i] = (int)(Math.random() * 100) %100 +1;
		}
		
		System.out.print("배열보기 : ");
		for (int i = 0; i < countArray.length; i++) {
			System.out.print(countArray[i] + " ");
		}
		System.out.println();
		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(countArray);
	}
}
