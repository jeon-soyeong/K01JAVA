package quiz_game;

import java.util.Random;
import java.util.Scanner;

/*
[Game]업다운게임(Up Down Game)

 게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1.컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2.총 시도횟수는 7번을 부여한다.
3.사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4.사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5.7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6.성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7.함수를 사용하여 구현한다.
8.무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.
 */

public class QuUpDownGame {

	public static void upDownStart(){
	
		System.out.println("업&다운 게임시작(숫자를 입력하세요):");
		while(true){
		
			Scanner scan = new Scanner(System.in);
			Random random = new Random();
	
			int com = random.nextInt(100)%100 +1;
			int gameCount = 0;
			
				while(gameCount<7){
					int user = scan.nextInt();
					if(com>user){
						System.out.println("up");
						gameCount++;
					}
					else if(com<user){
						System.out.println("down");
						gameCount++;
					}
					else if(com==user){
						System.out.println("성공");
						break;
					}
				}
				
				if(gameCount>=7){
					System.out.println();
					System.out.println("실패");
				}
				
				System.out.println();
			
				int restart;
				System.out.println("게임 재시작(1), 종료(0) :");
				restart = scan.nextInt();
				
				if(restart==1){
					gameCount = 0;
				}
				else{
					System.out.println("게임 종료");
					return;
//					scan.nextLine();
				}
		}	
	}
	public static void main(String[] args) {
		upDownStart();
	}
}			