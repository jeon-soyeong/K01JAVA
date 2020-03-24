package quiz_game;
/*
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

실행결과]
무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 1
사용자 : 가위, 컴퓨터 : 보
이겼습니다.

무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 4
가위바위보 할줄 모르세요? 제대로 내세요^^;

….게임진행...

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 1

….게임재시작…

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 0
게임이 종료되었습니다. 감사합니다.

….게임종료….

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 5
잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요…..
 */
import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors2 {

	public static void rpsGameStart()  {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;//게임의 횟수를 카운트하기 위한 변수
				
		while(true) {
		
			//1.난수생성 - 컴퓨터입장의 가위/바위/보
			int com = random.nextInt(100) % 3 + 1;//1~3사이의난수생성 ->nextInt()->1~10000사이의 숫자로 형성
//			int com = (int)(Math.random()*100 %3 +1);
//			System.out.println("컴퓨터:"+ com);
			
			//2.사용자 입력
			int user=0;			 
			System.out.println("가위바위보를 입력하세요");
			System.out.print("가위(1),바위(2),보(3)=>");		
			user = scanner.nextInt();
			
			//3.승부판단 및 결과출력
			if( !(user<1 || user>3) ) {
				//정확하게 입력했을때 승부를 판단
				System.out.printf("사용자:%s, 컴퓨터:%s ",
						displayRPS(user), displayRPS(com));
				
				//승부판단로직
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다");break;
				case 1: case -2:
					System.out.println("이겼습니다");break;
				case -1: case 2:
					System.out.println("졌습니다");break;
				}
				System.out.println();
				
				//게임카운트 증가
				gameCount++;
			}
			//====
			else {
				System.out.println("가위바위보 할줄 모름??븅신~");
				System.out.println();
			}
					
			//6.5번의 게임이 되었는지 판단후 재시작/종료 확인
			if(gameCount>=5) {
				
				int restart;
				while(true) {
					System.out.print("게임재시작(1), 종료(0):");
					restart = scanner.nextInt();
					if(restart==0 || restart==1) {
						//정상입력이면 루프탈출
						break;
					}
					else {
						System.out.println("잘못입력해씸ㅜㅜ\n");
					}
				}								
				if(restart==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				else {
					System.out.println("게임 재시작^^");
					gameCount=0;
				}
			}
//			=======
			
			
		}	
	}	
	//가위 바위 보를 출력하는 메소드
	public static String displayRPS(int n) {
		String str = "";
		switch (n) {
		case 1:
			str = "가위";break;
		case 2:
			str = "바위";break;
		case 3:
			str = "보";break;
		}
		return str;
	}
	
	public static void main(String[] args)
	{
		//가위바위보 게임 메소드 호출
		rpsGameStart();
	}
}
