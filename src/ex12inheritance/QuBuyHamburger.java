package ex12inheritance;
/*
햄버거를 추상화한 클래스와 기본가격, 세트가격을 추상화한 클래스를 정의하여
햄버거를 주문시 기본가격 혹은 세트가격으로 출력할 수 있도록 프로그램을 구현하시오. 
조건은 다음과 같다. 
햄버거
멤버변수 : 버거명, 가격, 패티, 소스, 야체
인자생성자 
멤버메소드 : 가격반환(getter), 햄버거정보출력
햄버거 기본가격 : 햄버거 + 음료 + 프렌치프라이의 합계
멤버변수 : 햄버거종류(객체), 음료가격(1000원으로 고정), 프렌치프라이가격(1500원으로 고정)
인자생성자
멤버메소드 : 기본가격계산, 결제금액출력
세트가격 : 기본가격클래스를 상속받음. 기본가격에서 500원 할인된 금액으로 계산
멤버변수 : 없음
인자생성자
멤버메소드 : 세트가격계산(Overriding), 결제금액출력(Overriding)
======
실행결과]
치즈버거
가격:2000
식재료:쇠고기패티, 케챱, 피클
결제금액 : 4500
================================
치킨버거
가격:3000
식재료:닭고기패티, 마요네즈, 양상치
세트결제금액 : 5000
================================
 */
class Burger {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야채를 표현 */
	String burgerName;
	int burgerPrice;
	String pat;
	String source;
	String veg;
	//인자생성자
	public Burger() {}
	public Burger(String bName, int pri, String pat,
			String sou, String veg) {
		this.burgerName = bName;
		this.burgerPrice = pri;
		this.pat = pat;
		this.source = sou;
		this.veg = veg;
	}
	//getter : price만 필요
	public int getPrice() {
		return burgerPrice;
	}
	//햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
	public void showBugerInfo() {
		System.out.println(burgerName);
		System.out.println("가격:"+burgerPrice);
		System.out.printf("식재료:%s,%s%s\n",pat,source,veg);
	}
}
//햄버거의 기본가격 추상화 
class HamburgerPrice extends Burger {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	//인자생성자
	public HamburgerPrice() {}
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	
	//기본가격계산
	public int totalPrice() {
		return (burger.burgerPrice + COKE + POTATO);
	}
	
	//햄버거와 결제금액 출력
	public void showPrice() {
		System.out.println(burger.burgerName);
		System.out.println("가격:"+burger.burgerPrice);
		System.out.printf("식재료:%s,%s,%s\n",burger.pat,burger.source,burger.veg);
		System.out.println("결제금액:"+totalPrice());
		System.out.println("========================");
	}
}
//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice {	
	//인자생성자
	public SetPrice(Burger burger) {
		this.burger = burger;
	}
	//세트가격계산(오버라이딩)
	@Override
	public int totalPrice() {
		return (int) ((burger.burgerPrice + COKE + POTATO)-500);
	}
	//햄버거와 세트결제금액 출력(오버라이딩)	
	@Override
	public void showPrice() {
		System.out.println(burger.burgerName);
		System.out.println("가격:"+burger.burgerPrice);
		System.out.printf("식재료:%s,%s,%s\n",burger.pat,burger.source,burger.veg);
		System.out.println("세트결제금액:"+totalPrice());
		System.out.println("========================");
	}
}


public class QuBuyHamburger {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
	}
}

