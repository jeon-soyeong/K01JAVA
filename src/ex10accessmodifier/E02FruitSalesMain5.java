package ex10accessmodifier;

//과일판매자를 추상화한 클래스
class FruitSeller3{
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	final int APPLE_PRICE;//다시 상수로 선언함.
	
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

public class E02FruitSalesMain5 {
	public static void main(String[] args) {
		
		//판매자1
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		//판매자2
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		아래의 코드는 문법적으로 오류가 없으나 지불금액과 구매한
		사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게 된다.
		객체지향 언어에서는 이런 논리적 오류를 범하지 않기위해
		"정보은닉" 이라는 개념을 제시하고 있다.
		 */
		seller1.myMoney += 1000;//판매자1에게 1000원을 지불하고
		seller1.numOfApple -= 50;//사과 50개를 구매하였다.
		buyer.numOfApple += 50;
		
		seller2.myMoney += 1000;//판매자2에게 1000원을 지불하고
		seller2.numOfApple -= 70;//사과 70개를 구매하였다.
		buyer.numOfApple += 70;//하지만 구매자의 보유금액은 차감되지 않았다.
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
		
	}
}
