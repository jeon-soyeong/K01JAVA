package ex09package.kosmo.buyer;
/*
 FruitSeller4 클래스는 외부패키지에 정의되어 있으므로
 반드시 import해야 한다. buyApple ()메소드에서
 매개변수로 사용되고 있기 때문이다.
 */
import ex09package.kosmo.seller.FruitSeller4;

public class FruitBuyer4 {
	//구매자를 표현한 클래스
		
		int myMoney;//보유한 금액
		int numOfApple;//구매한 사과의 갯수
		
		public FruitBuyer4(int _myMoney, int _numOfApple) {
			myMoney = _myMoney;
			numOfApple = _numOfApple;
		}
		
		public void buyApple(FruitSeller4 seller, int money) {
			numOfApple += seller.saleApple(money);
			myMoney -= money;
		}
		public void showBuyResult() {
			System.out.println("[구매자]현재 잔액:"+ myMoney);
			System.out.println("[구매자]사과갯수:"+ numOfApple);
		}
	}	
