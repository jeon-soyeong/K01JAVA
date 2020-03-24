package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList : List계열의 컬렉션으로
	-데이터의 중복 저장이 허용된다.
	-데이터의 저장 순서를 보장한다.
	-데이터에 접근할 때 iterator()
	 혹은 get()을 이용한다.
	-Array라는 이름처럼 '배열'의 특성을 가지고 있어
		인덱스를 통한 저장 및 접근이 가능하다.
 */
public class Ex03ArrayList1 {

	public static void main(String[] args) {
		
		/*
		 List<E> 인터페이스 계열의 컬렉션
		 	: ArrayList<T>와 같은 컬렉션은 제네릭을 기반으로 하지만
		 	아래와 같이 <T>부분을 생략하면 모든 객체를 저장할 수 있는
		 	컬렉션이 된다. 즉 <Object>로 선언한 것과 동일하다.
		 */
		ArrayList list = new ArrayList();
		
		/*
		 1-1] 객체저장 : add()메소드
		 	add(객체) :  순차적으로 저장하면서 인데스는 0부터
		 		자동으로 부여한다.
		 	add(인덱스, 객체) : 인덱스를 직접 부여하여 객체를
		 		저장한다. 단, 인덱스를 건너뛰면 예외가 발생된다.
		 		
		 	size() : 컬렉션에 저장된 객체의 객수를 반환한다.
		 		배열의 크기와 동일하다고 생각하면 된다.
		 */
		list.add("소녀시대");//인덱스 0
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
//		list.add(5,"소방차ㅋㅋ");//에러발생. 인덱스는 건너뛸 수 없다.
		list.add(list.size(),"오마이걸");//<-4번 인덱스에 입력됨.
		list.add(list.size(),"방탄소년단");
		System.out.println("중복 저장전 객체수:"+ list.size());
	
		/*
		 1-2] 중복저장 
		 : List는 배열의 속성을 가지므로 중복저장이 허용된다.
		 add()메소드는 입력에 성공한 경우 true를 반환한다.
		 */
		System.out.println(list.add("트와이스")? "중복저장됨" :
			"중복저장안됨");
		System.out.println("중복 저장후 객체수:"+ list.size());
	
		/*
		 1-3] 리스트 컬렉션 출력하기(for, 확장 for문)
		 */
		System.out.println("\n[일반 for문 사용]");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println("\n[확장 for문 사용]");
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		/*
		 Iterator 사용법
		 - 컬렉션에 저장된 내용을 Iterator에게 알려주기 위해
		 	객체를 생성한다.
		 - hasNext()메소드로 반환할 객체가 있는지 검사하고,
		 	next()메소드로 해당 객체를 반환한다.
		 - 만약 반환할 객체가 없다면 false를 반환한다.
		 */
		System.out.println("\n[반복자(Iterator) 사용]");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n=====================\n");
		
		/*
		 1-4] 덮어쓰기 
		 	set(인덱스, 객체) : 특정 인덱스에 저장된 데이터를
		 		덮어쓰게 되므로 기존자료는 삭제된다.
		 */
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println("\n=====================\n");
		
		/*
		 1-5] 끼워넣기
		 	add(삽입할 인데스, 객체) : 해당 인덱스에 삽입하고,
		 		기존데이터는 뒤로 밀리게 된다.
		 */
		list.add(4,"블랙핑크>덮어쓰기");
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println("\n=====================\n");
		
		/*
		 1-6] 포함여부확인
		 	contains(객체명) : 찾고자 하는 객체가 있는 경우
		 	 	true를 반환한다.
		 */
		System.out.println(list.contains("빅뱅")? "빅뱅 있음" : "빅뱅 없음");
		System.out.println(list.contains("블랙핑크")? "블랙핑크 있음" : "블랙핑크 없음");
	
		/*
		 1-7] 삭제
		 방법1 : 인덱스로 삭제하기
		 	remove(인덱스) : 인덱스를 통해서 삭제를 진행한 후
		 		삭제가 완료되면 해당 객체를 반환한다. 삭제 후에는
		 		인덱스가 자동으로 재부여 된다.
		 */
		Object obj = list.remove(2);
		System.out.println("삭제된 객체:"+ obj);
		
		//방법2 : indexOf()메소드로 인덱스를 찾은 후 삭제
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index="+ index);
		list.remove(index);
		
		//방법3 : 인스턴스의 참조(주소)값을 통해 삭제
		System.out.println(list.remove("방탄소년단")? "삭제성공" : 
			"삭제실패");
		list.remove("오마이걸");
		System.out.println("삭제후 출력");
		for(Object ob : list) {
			System.out.print(ob + " ");
		}
		System.out.println();
		
		/*
		 1-8] 전체삭제
		 */
		list.removeAll(list);//방법1
		list.clear();//방법2 
		System.out.println("전체삭제 후 객체 수:"+ list.size());
	
	}
}
