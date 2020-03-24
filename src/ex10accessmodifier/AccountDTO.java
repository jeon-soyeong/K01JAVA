package ex10accessmodifier;

/*
 DTO클래스(Data Transfer Object)
 	: 데이터 교환을 위한 객체이다. 스프링에서는 Bean(빈)이라고
 	부르기도 한다.
 	주로, DTO객체는 로직을 전혀 가지고 있지 않은 순수한 데이터 객체이며,
 	멤버변수에 접근하기 위한 getter/setter메소드를 가지고있다.
 	VO(Value Object)라고 부르기도 한다.
 */
public class AccountDTO {
	//1. 속성(멤버변수)
	private String name;//예금주
	private String accountNumber;//계좌번호
	private int balance;//잔액(잔고)
	//기본생성자, 인자생성자 (필요한 경우에만 정의한다.)
	public AccountDTO() {}
	public AccountDTO(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//2. getter/setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
