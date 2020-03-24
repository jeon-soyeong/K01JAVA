package quiz_game;
/*
 파일명 : QuRockPaperScissors.java
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
import java.io.IOException;
import java.util.Random;

public class QuRockPaperScissors {
	public static void main(String[] args) throws IOException {
		
		Random random = new Random();
		
		int exitCode;
		int wrongInput;
		
		do{
			System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
			int coumputerNumber = (int)(Math.random()*100 %3 +1);
			int userNumber = System.in.read()-'0';
			if(userNumber > 3){
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				
			}
			
			
			System.out.print("사용자 : ");
			switch(userNumber){
			case 1:
				System.out.print("가위"); break;
			case 2:
				System.out.print("바위"); break;
			case 3:
				System.out.print("보"); break;
			}
			System.out.print(","+" 컴퓨터 : ");
			switch(coumputerNumber){
			case 1:
				System.out.print("가위"); break;
			case 2:
				System.out.print("바위"); break;
			case 3:
				System.out.print("보"); break;
			}
			
			System.out.println();
			
			if((userNumber == 1 && coumputerNumber == 2) || (userNumber == 2 && coumputerNumber == 3)
			|| (userNumber == 3 && coumputerNumber == 1)){
				System.out.println("졌습니다.");
			}
			else if(userNumber==coumputerNumber){
				System.out.println("비겼습니다.");
			}
			else{
				System.out.println("이겼습니다.");
			}
			
			
			System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
			exitCode = System.in.read()-'0';
				if(exitCode != 0 && exitCode !=1){
					System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요…..");
				}
		
			}while(!(exitCode == 0));
			
		
	}
}
