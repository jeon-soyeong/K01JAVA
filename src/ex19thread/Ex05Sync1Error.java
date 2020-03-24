package ex19thread;

class SumMulti{
	int num;
	public SumMulti() {
		num = 0;
	}
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}
class MultiAdderThread extends Thread{
	SumMulti sumInst;
	int start, end;
	public MultiAdderThread(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	public void run() {
		for(int i = start; i<= end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync1Error {

	public static void main(String[] args) {
		
		SumMulti s = new SumMulti();
		MultiAdderThread mat1 =  new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 =  new MultiAdderThread(s, 5001, 10000);
		mat1.start();
		mat2.start();
		
		try {
			mat1.join();
			mat2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합:"+s.getNum());
	}
}
