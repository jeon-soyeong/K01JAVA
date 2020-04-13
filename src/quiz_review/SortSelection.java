package quiz_review;
import java.util.Random;
import java.util.Scanner;

class SortSelection
{
	public static void main(String[] args)
	{	
		int[] arr = new int[10];

		//난수생성
		randomCreate(arr);
	 
		//배열요소출력
		showArray(arr, -1);
		
		//오름차순/내림차순 선택
		int menuNum = menuSelect();
		
		//정렬
		SelectSort(arr, menuNum);
	}
	public static void showArray(int paramArr[], int re)
	{
		if (re >= 0) {
			System.out.print("Sort"+(re + 1)+"번진행 : ");
		}
		else {
			System.out.print("배열보기 : ");
		}

		for (int i = 0; i < paramArr.length; i++)
		{
			System.out.print(paramArr[i]+" ");
		}
		System.out.println("");
	}
	public static void randomCreate(int[] arr)
	{		
		Random rnd = new Random();
		rnd.setSeed(System.currentTimeMillis());
		
		while(true)
		{
			boolean rndFlag = false;//난수중복체크를 위한 변수
			
			//난수10개생성
			for(int i=0 ; i<arr.length ; i++)
			{
				arr[i] = rnd.nextInt(99)+1;
			}
			//난수중복처리
			for(int i=0 ; i<arr.length ; i++)
			{
				for(int j=0 ; j<arr.length ; j++)
				{					
					if(i!=j && arr[i]==arr[j])//중복확인
					{
						rndFlag = true;
					}
				}
			}
			if(rndFlag==false) break;
		}
	}
	public static int menuSelect()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬방식을 선택하세요");
		System.out.println("1.오름차순");
		System.out.println("2.내림차순");
		int sortMethod = sc.nextInt();
		return sortMethod;
	}
	public static void SelectSort(int paramArr[], int mNum)
	{
		int m, m_index, temp;
		//0~8까지반복함..배열보다 1작은만큼 반복.
		for (int seq = 0; seq < paramArr.length - 1; seq++)
		{			
			if(mNum==1)//오름차순
			{
				m = paramArr[seq];//비교할 최소값 지정
				m_index = seq;
				for (int i = seq + 1; i < paramArr.length; i++)
				{
					if (m > paramArr[i])
					{
						m = paramArr[i];
						m_index = i;//최소값이 있는 인덱스번호				
					}
				}
				//swap
				if (paramArr[seq] > paramArr[m_index])
				{
					temp = paramArr[seq];//현재 Loop의 배열요소
					paramArr[seq] = paramArr[m_index];
					paramArr[m_index] = temp;
				}
			}
			else if(mNum==2)//내림차순
			{
				m = paramArr[seq];//비교할 최대값 지정
				m_index = seq;
				for (int i = seq + 1; i < paramArr.length; i++)
				{
					if (m < paramArr[i])
					{
						m = paramArr[i];
						m_index = i;//최대값이 있는 인덱스번호				
					}
				}
				//swap
				if (paramArr[seq] < paramArr[m_index])
				{
					temp = paramArr[seq];//현재 Loop의 배열요소
					paramArr[seq] = paramArr[m_index];
					paramArr[m_index] = temp;
				}
			}			

			//배열요소출력
			showArray(paramArr, seq);
		}
	}
}
