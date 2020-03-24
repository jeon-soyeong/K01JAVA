package ex12inheritance;
/*
 상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자.
 그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
 
 실행결과]
남은가솔린:10
남은전기량:20
남은워터량:30
 */
class Car2{
   	int gasoline;
   	
   	//생성자
   	public Car2(int gas) {
   		gasoline = gas;
   		System.out.println("Car 생성자 호출");
   	}
}

class HybridCar2 extends Car2{
   	int electric;
   	
   	//생성자
   	public HybridCar2(int gas, int ele) {
   		super(gas);
   		electric = ele;
   		System.out.println("HybridCar2 생성자 호출");
   	}
}
class HybridWaterCar2 extends HybridCar2{
    int water;

    //생성자 
    public HybridWaterCar2(int gas, int ele, int wat) {
    	//부모클래스로 gas, ele를 전달하여 생성자 호출
    	super(gas, ele);
    	water = wat;
    	System.out.println("HybridWaterCar2 생성자 호출");
    }
   	
	public void showNowGauge(){
         	System.out.println("남은가솔린:"+gasoline);
         	System.out.println("남은전기량:"+electric);
         	System.out.println("남은워터량:"+water);
   	}
}

public class QuConstructorAndSuper2 {
	
	public static void main(String[] args){
		HybridWaterCar2 hCar2 = new HybridWaterCar2 (10,20,30);
		hCar2.showNowGauge();
	}
}
