package ex10accessmodifier;

/*
 캡슐화(Encapsulation)
 	: 여러가지 비즈니스 로직을 하나로 묶는다는 의미와
 	업무의 순서까지 고려한 형태의 로직을 구성한다는 의미를
 	가지고 있다.
 	즉, 관련 있는 메소드를 하나의 클래스로 묶는 것을 말한다.
 */

//아래 4가지 업무는 번호순서대로 진행되어야 한다고 가정한다.
class MemberRegist{
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}
class CongratulationPoint{
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트를 지급합니다.");
	}
}
class AutoLogin{
	void doAutoLogin() {
		System.out.println("2.자동로그인");
	}
}
class FirstLonginEvent{
	void doFirstLonginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다.");
	}
}
/*
 업무의 순서를 고려하여 관련된 메소드를 하나의 클래스로 정의하였다.
 자후에는 별도의 분석 작업없이 해당 클래스의 메소드만 호출하면
 업무는 오류없이 진행될 것이다.
 */
class EncapsulLogic{
	MemberRegist memberRegist = new MemberRegist();
	FirstLonginEvent firstLonginEvent = new FirstLonginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLonginEvent.doFirstLonginEvent();
	}
}
public class E05Encapsulation {
	
	public static void main(String[] args) {
		
		/*
		 업무의 진행순서가 중요하다고 했을 때 캡슐화 이전의 코드에서는
		 개발자가 순서를 지키지 않은 상태에서도 실행이 가능한 코드가 된다.
		 */
		System.out.println("캡슐화 전 코드");
		
		MemberRegist memberRegist = new MemberRegist();
		FirstLonginEvent firstLonginEvent = new FirstLonginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
	
		memberRegist.doMemberRegist();
		firstLonginEvent.doFirstLonginEvent();
		congratulationPoint.doCongratulationPoint();
		autoLogin.doAutoLogin();
	
		System.out.println("====================");
		
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
	
	}
}
