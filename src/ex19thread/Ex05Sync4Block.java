package ex19thread;

class DataSyncClass
{
	int shareData;
	public DataSyncClass(int sData) {
		this.shareData = sData;
	}
}

class DataSyncThread extends Thread
{
	DataSyncClass dsc;
	int inc;
	String threadName;

	public DataSyncThread(DataSyncClass dsc, int inc,
			String threadName)
	{
		super(threadName);

		this.dsc = dsc;
		this.inc = inc;
		this.threadName = threadName;
	}

	void increase() {
		for(int i=1 ; i<=10 ; i++) {

			synchronized (dsc) {
				dsc.shareData += inc;
			}
			
			System.out.println(
				String.format("쓰레드명:%s,공유데이터:%d"
					, getName(), dsc.shareData)
			);

			try {
				sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}

	@Override
	public void run() {
		increase();	
	}
}

public class Ex05Sync4Block
{
	public static void main(String[] args)
	{		
		DataSyncClass dsc = new DataSyncClass(10);
			
		DataSyncThread t1 = new DataSyncThread(dsc, 2,
				"1st 쓰레드");
		DataSyncThread t2 = new DataSyncThread(dsc, 5,
				"두번째 쓰레드");

		t1.start();
		t2.start();
	}
}


