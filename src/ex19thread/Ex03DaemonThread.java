package ex19thread;

/*
 쓰레드로 구현하지 않은 클래스
 */
/*
 	: 하나의 클래스가 작업을 끝내야 다음 클래스의 
 	작업을 진행할 수 있다. 즉 동시에 작업을 진행할 수
 	없다.
 */
class NotThread{
	String title;
	public NotThread(String title) {
		this.title =  title;
	}
	void notThreadMethod() {
		for(int i =1; i<=10; i++) {
			System.out.println(String.format("%s]i=%d", title, i));
		}
	}
}
/*
 독립쓰레드(Non Deamon Thread)
	: 메인쓰레드와 working쓰레드(개발자가 정의한 쓰레드)를 
	일컫는 것으로 메인쓰레드가 종료되어도 계속 실행되며, Dead
	상태가 되어야 실행이 종료되는 쓰레드를 말한다.
	해당쓰레드를 실행하게 되면 main메소드가 종료된 이후에도
	실행되는 것을 볼 수 있다.
 */
class yesThread extends Thread{
	public yesThread() {}
	/*
	 Thread클래스의 생성자를 호출할 때 전달하는 매개변수를
	 통해 해당 쓰레드의 이름을 지정할 수 있다. 지정된 이름은
	 getName()메소드를 통해 반환할 수 있다.
	 */
	public yesThread(String threadName) {
		super(threadName);
	}
	void threadMethod() throws InterruptedException{
		for(int i =1; i<=10; i++) {	
			System.out.println(String.format("%s]i=%d", getName(), i));
			sleep(2000);//2초에 한번씩 Block상태가 된다.
		}
	}
	
	@Override
	public void run() {
		try {
			threadMethod();
		} catch (InterruptedException e) {}
	}
}
/*
 종속 쓰레드(Deamon Thread)
 	:모든 독립쓰레드가 종료되면 자동으로 종료되는 쓰레드를
 	말한다. 주로 프로그램의 보조역할로 배경음악, 로그자동저장
 	등의 업무를 처리한다.
 	프로그램이 종료될 때 자동으로 종료되므로 주로 무한루프로
 	구성한다. setDaemon(true) 메소드로 설정할 수 있다.
 */
class DaemonThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(String.format("[쓰레드명:%s]Jazz가 흘러요~", getName()));
			try {
				sleep(3000);
				System.out.println("3초마다 자동저장!!");
			} catch (InterruptedException e) {
				System.out.println("자동저장시 오류발생ㅜㅜ");
			}
		}
	}
}

public class Ex03DaemonThread {

	public static void main(String[] args) {
		
		/*
		 쓰레드로 구현하지 않은 클래스의 작업
		 */
		NotThread nt1 = new NotThread("첫번째 클래스");
		nt1.notThreadMethod();
		
		NotThread nt2 = new NotThread("두번째 클래스");
		nt2.notThreadMethod();
		
		/*
		독립쓰레드 (Non Daemon Thread) 실행
		 */
		yesThread yt1 = new yesThread("1st 쓰레드");
		yt1.setName("첫번째 쓰레드");//쓰레드의 이름지정 두번째 방법
		yt1.start();//쓰레드 객체를 Runnable상태로 만들어준다.
		
		yesThread yt2 =  new yesThread();/*
				쓰레드 생성시 이름을 지정하지 않으면 JVM이 
				자동으로 이름을 부여한다.*/
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();
				
		/*
		 데몬(=종속)쓰레드(Daemon Thread) 실행
		 */
		DaemonThread dt = new DaemonThread();
		dt.setName("난 데몬쓰레드");
		dt.setDaemon(true);//독립쓰레드를 데몬쓰레드로 만들어준다.
		dt.start();
		
		System.out.println("현재활성화 된 상태의 쓰데드 수"+ Thread.activeCount());
		System.out.println("현재 실행중인 쓰데드 명"+ Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위"+ Thread.currentThread().getPriority());
		System.out.println("메인함수(Main Thread) 종료)");
		
	}
}
