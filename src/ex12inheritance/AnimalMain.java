package ex12inheritance;
/*
종은:포유류
나이는:2
성별은:수컷
====================

이름이 뽀미이고 종이 포유류인 강아지가 짖는다
====================
종은:포유류
나이는:2
성별은:수컷
종류는:포매라니안
이름은:뽀미

 */
public class AnimalMain {

	public static void main(String[] args) {
		//강아지 객체생성
		AnimalDog dog = 
			new AnimalDog("포유류",2,"수컷","포매라니안","뽀미");
		
		dog.showAnimal();
		System.out.println("====================");
		dog.bark();
		System.out.println("====================");
		dog.showDog();
	}
}
