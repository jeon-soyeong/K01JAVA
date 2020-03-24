package ex12inheritance;
/*
연습문제] Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.
 */
public class Animal {
	
	private String species;
	int age;
	String gender;
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	/*
	 부모클래스의 멤버가 private인 경우 자식클래스에서 접근이
	 불가능하므로 반드시 getter/ setter 메소드를 통해
	 접근해야 한다.
	 */
	public String getSpecies() {
		return species;
	}
	public void showAnimal() {
		System.out.println("종은:"+species);
		System.out.println("나이는:"+age);
		System.out.println("성별은:"+gender);
	}
}
