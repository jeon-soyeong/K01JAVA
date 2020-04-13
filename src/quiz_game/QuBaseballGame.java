package quiz_game;

import java.util.Random;
import java.util.Scanner;

/*
 [Game]야구게임(Baseball Game)

 게임설명 : 야구게임을 메소드를 이용하여 구현한다.
1.중복되지 않는 3개의 정수를 생성한다.(1~9)
2.사용자는 3개의 숫자를 입력한다.
3.생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
4.숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
5.숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
6.숫자3개가 모두 일치하지 않으면 out 으로 판정한다.
7.3 strike 가 되면 게임은 종료된다.
8.시도한 횟수를 표시한다.
9.계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3]; 
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.
 */
public class QuBaseballGame {

	public static void playBall(){
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int gameCount =1;
		int strikeCount = 0;
		
		while(true){
		
		int com[] = new int [3];
		for(int i = 0; i<com.length; i++){
			com[i]= random.nextInt(10)% 9 +1;
			System.out.print(com[i]);
		}
		
		
		System.out.println("숫자 세개를 입력하세요:");
		int user[] = new int [3];
		for(int i = 0; i<user.length; i++){
			user[i]= scan.nextInt();
		}
		
		int ballCount = 0;
		int oneStrikeCount = 0;
		
		for(int i = 0; i<com.length; i++){
			for(int j = 0; j<user.length; j++){
				if(com[i]==user[j]){
					ballCount++;
					if(i==j){
						oneStrikeCount++;
					}
				}
			}
		}
		
		if(oneStrikeCount==3){
			System.out.println("strike");
			strikeCount++;
		}
		else if(ballCount==0){
			System.out.println("out");
		}
		else{
			System.out.println("ball");
		}
		
		if(strikeCount==3){
			System.out.println();
			System.out.println("3 strike!! 게임을 종료합니다!!");
			scan.nextInt();
		}

		int restart;
		System.out.println();
		System.out.println("게임 재시작(1), 게임 종료(0):");
		restart = scan.nextInt();
			if(restart==0){
				System.out.println("게임을 종료합니다.");
				scan.nextInt();
			}
			else{
				System.out.printf("%d번째 재시도\n", gameCount++);
				System.out.println();
			}
	}
	
	}
	public static void main(String[] args) {
		playBall();
	}

}

