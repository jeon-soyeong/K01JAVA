package ex08class;

//과일판매자를 추상화한 클래스
class FruitSeller3{
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	final int APPLE_PRICE;//다시 상수로 선언함.
	
	/*
	상수는 값의 변경이 불가능하고 단 한번만 초기화되기
	때문에 일반적인 멤버메소드에서는 초기화 할수없다.
	단, 생성자메소드에서는 초기화가 가능하다.
	마음대로 호출할수없고, 객체생성시 단 한번만 호출되는
	특성이 동일하기때문에 한번이상 초기화되지 않음이
	보장되기 때문이다.
	 */
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;// <- 생성자 내에서는 상수를 초기화할 수 있음.
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과 갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

//구매자를 표현한 클래스
class FruitBuyer3{
	
	int myMoney;//보유한 금액
	int numOfApple;//구매한 사과의 갯수
	
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}	

public class E06FruitSalesMain3 {
	public static void main(String[] args) {
		
		/*
		생성자를 통해서 객체 생성과 동시에 초기화되므로
		init(초기화메소드)메소드를 호출할 필요가 없어진다.
		따라서 객체생성코드를 한줄로 줄일수있다.
		 */
		//판매자1
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		//판매자2
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
