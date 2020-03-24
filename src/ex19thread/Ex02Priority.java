package ex19thread;

/*
 쓰레드의 우선순위
 	setPrioty(우선순위) : 쓰레드의 우선순위를 지정할 때 사용
 	getPriority() :  쓰레드의 우선순위를 반환할 때 사용
 */
class MessageSendingThread extends Thread{
	String message;
	
	public MessageSendingThread(String str) {
		message = str;
	}
	//생성자2 : 멤버변수와 우선순위까지 초기화
	public MessageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri);
	}
	public void run() {
		for(int i=1; i<=1000; i++) {
			//쓰레드의 이름과 우선순위를 반환한다.
			System.out.println(message+ i + "("+ getPriority()+")");
			
			/*
			 기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만, sleep()
			 메소드를 사용하게 되면 실행 중 블럭상태로 전환되어 우선순위가
			 낮은 쓰레드도 가끔 실행될 수 있는 상황이 생긴다.
			 */
			try {
				//0.001초동안 블럭상태로 만듬
				sleep(1);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex02Priority {

	public static void main(String[] args) {
		
		/*
		 1단계
		 	: 우선순위를 별도로 지정하지 않은 상태로 쓰레드를
		 	생성하면 동일한 우선순위 5를 부여받게 된다.
		 	이때는 CPU가 알아서 작업을 분배한다.
		 */
//		MessageSendingThread tr1 =  new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 =  new MessageSendingThread("두번째");
//		MessageSendingThread tr3 =  new MessageSendingThread("세번째");
		
		/*
		 2단계
		 	: 우선순위 부여를 위해 Thread클래스에 static타입의
		 	상수를 이용한다.
		 	※우선순위가 높다고 무조건 먼저 실행되지는 않는다.
		 	전체적인 확률이 높아지게되어 먼저 실행될 가능성이 
		 	높아진다고 생각하면 된다.
		 */
		MessageSendingThread tr1 = 
				new MessageSendingThread("첫번째", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = 
				new MessageSendingThread("두번째", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = 
				new MessageSendingThread("세번째", Thread.MIN_PRIORITY);
		
		/*
		 3단계
		 	: static상수 대신에 정수를 사용해도 무방하다.
		 */
//		MessageSendingThread tr1 = 
//				new MessageSendingThread("첫번째", 10);
//		MessageSendingThread tr2 = 
//				new MessageSendingThread("두번째", 5);
//		MessageSendingThread tr3 = 
//				new MessageSendingThread("세번째", 1);
		
		tr1.start();
		tr2.start();
		tr3.start();
		
	}

}
