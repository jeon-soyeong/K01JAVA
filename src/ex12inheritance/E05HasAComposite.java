package ex12inheritance;
/*
 구성관계로 표현한기에 적합한 Has-A관계
 	: X Has a Y -> X가 Y를 소유하고 있다.
 	-경찰이 권총을 소유하다.
 	-경찰이 수갑을 소유하다.
 	
 	Has-A와 같이 소유의 관계를 상속으로 표현하면 클래스 간의
 	강한 연결고리가 형성되어 권총이 없는 경찰을 표현하기가 
 	힘들어진다. 따라서 이 경우에는 구성관계로 표현하는 것이
 	적합하다. 구성관계는 클래스의 멤버로 또 다른 객체를
 	정의하는 것을 말한다.
 */
class Gun{
	
	int bullet;//총알의 갯수
	public Gun(int bNum) {
		bullet = bNum;
	}
	//총을 쏘는 행위를 표현
	public void shutGun() {
		System.out.println("빵야~~!");
		//탄환이 감소됨
		bullet--;
	}
}
class Police {
	
	int handCuffs;//수갑의 보유갯수
	Gun gun;//보유한 권총
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		/*
		 권총 보유여부 초기화
		 	: 만약 총알이 없는 상태라면 보유한 권총이 없는 것으로 
		 	표현한기 위해 참조변수를 null로 초기화한다. 참조변수가
		 	null값을 가진다는 것은 아무것도 참조할 객체가 없다는 
		 	의미이다. 
		 */
		if(bNum<=0) {
			gun = null;
		}
		else {
			gun = new Gun(bNum);
		}
	}
	//수갑을 채우는 행위
	public void putHandcuff() {
		System.out.println("수갑채움~!넌 콩밥~!");
		handCuffs--;
	}
	//경찰이 권총을 발사하는 행위 
	public void shut() {
		if(gun==null) {
			System.out.println("보유한 건총없음. 헛빵~!");
		}
		else {
			gun.shutGun();
		}
	}
}

public class E05HasAComposite {

	public static void main(String[] args) {
		
		//권총을 보유한 경찰을 표현
		System.out.println("==경찰1==");
		Police police1 = new Police(5, 3);
		police1.shut();
		police1.putHandcuff();
		
		//권총을 보유하지 않은 경찰을 표현
		System.out.println("==경찰2==");
		Police police2 = new Police(0, 3);
		police2.shut();
		police2.putHandcuff();
	}

}


//Animal hanimal = new Human();
//if(hanimal instanceof Human) {
//	Human human = (Human)hanimal
//}

