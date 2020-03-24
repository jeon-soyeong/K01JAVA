package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import common.Student;

public class Ex03ArrayList2 {

	public static void main(String[] args) {
		
		//List계열의 컬렉션 생성시 타입매개변수를 Student형으로 선언함.
//		LinkedList<Student> list2 =  new LinkedList<Student>();
		ArrayList<Student> list2 =  new ArrayList<Student>();
		
		//개발자가 정의한 인스턴스 생성(외부패키지)
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 10, "2017");
		Student st3 = new Student("장동건", 10, "2016");
		Student st4 = new Student("공유", 10, "2015");
		
		//컬렉션에 인스턴스 추가(저장)
		list2.add(st1);//인덱스0
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);//인덱스3
		list2.add(st2);//* 객체의 중복저장. List컬렉션은 중복 허용됨.*/
		
		//
		System.out.println("[중복저장 후]");
		for(Student st : list2) {
			st.showInfo();
		}
		
		/*
		 인스턴스 삭제 : 인덱스가 아닌 객체의 참조값을 통해 삭ㄱ제하는 경우
		 	중복된 값이 있으면 앞에 있는 객체가 하나만 삭제된다.
		 */
		list2.remove(st2);
		System.out.println("[중복 저장된 객체 삭제후]");
		for(Student st : list2) {
			st.showInfo();
		}
		
		System.out.println("[반복자 사용]");
		Iterator<Student> it2 = list2.iterator();
		while(it2.hasNext()) {
			/*Student student = it2.next();
			student.showInfo();*/
			/*
			 위와 동일한 문장임. next()메소드를 통해 객체를 가져온 후
			 showInfo()메소드로 객체의 내용출력.
			 */
			it2.next().showInfo();
		}
		
		//List계열의 컬렉션은 인덱스로 접근 가능함
		System.out.println("[일반 for문 사용]");
		for(int i = 0;  i<list2.size(); i++) {
			/*
			 리스트 컬렉션에 인덱스로 접급할 때는 get()메소드를 사용한다.
			 */
			list2.get(i).showInfo();
		}
		
		System.out.println("[확장된 for문 사용]");
		for(Student st : list2) {
			st.showInfo();
		}
		
		//인덱스를 통한 삭제 : 삭제성공시 해당객체가 반환된다.
		System.out.println("삭제된 객체의 이름:"+
				list2.remove(2).name);
		//인스턴스 참조값을 통한 삭제 : 삭제성공시 boolean값이 반환된다.
		list2.remove(st1);
		
		System.out.println("[인스턴스 삭제후]");
		for(Student st : list2) {
			st.showInfo();
		}
	}

}
