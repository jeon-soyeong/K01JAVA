package quiz_game;
/*
선택정렬은 전체요소 중에서 최소값을 찾아 첫번째 자리와 교환한다.
1회전을 수행하면 최소값이 맨 앞에 오게되므로 첫번째 자료를 제외한 나머지 자료에서 다시 최소값을 찾아 두번째 자리와 교환한다. 
이 과정을 반복한다. 
자료가 N개라면 교환은 (N-1)번 이루어진다.
 */
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	
	public void ascSort(int [] countArr){
		int min;
		int temp;
		for (int i = 0; i < countArr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < countArr.length; j++) {
				if (countArr[min] > countArr[j]) {
					min = j;
				}
			}
			temp = countArr[min];
			countArr[min] = countArr[i];
			countArr[i] = temp;
			
			for (int x = 0; x < countArr.length; x++) {
				System.out.print(countArr[x] + " ");
			}
			System.out.println();
		}
	}
	
	public void descSort(int [] countArr){
		int max;
		int temp;
		for (int i = 0; i < countArr.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < countArr.length; j++) {
				if (countArr[max] < countArr[j]) {
					max = j;
				}
			}
			temp = countArr[max];
			countArr[max] = countArr[i];
			countArr[i] = temp;
			
			for (int x = 0; x < countArr.length; x++) {
				System.out.print(countArr[x] + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {

		int[] countArr = new int[10];

		for (int i = 0; i < countArr.length; i++) {
			countArr[i] = (int) ((Math.random() * 100) % 100) + 1;
		} 
		
		System.out.print("배열보기 : ");
		for (int i = 0; i < countArr.length; i++) {
			System.out.print(countArr[i] + " ");
		}
		System.out.println();
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("1.오름차순, 2.내림차순");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		SelectionSort selectionSort = new SelectionSort();
		
		switch (inputNum) {
		case 1:
			selectionSort.ascSort(countArr);
			break;
		case 2:
			selectionSort.descSort(countArr);
			break;
		}
	}
}

