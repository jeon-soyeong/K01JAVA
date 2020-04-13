package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
 HashSet 컬렉션 : Set계열의 인터페이스를 구현한 컬렉션으로 
 -객체가 순서없이 저장된다.
 -객체의 중복저장을 기본적으로 허용하지 않는다.
 	단, 기본클래스가 아닌 새롭게 정의한 클래스라면 hashCode,
 	equals 메소드를 적절히 오버라이딩 해야한다.
 -List가 배열의 성격이라면, Set은 집합의 성격을 가진다.
 */
public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		/*
		 1]set컬렉션 생성
		 */
		HashSet<Object> set =  new HashSet<Object>();
		
		//2]다양한 객체 생성
		String strObject1 = "JAVA";
		String strObject2 = new String("KOSMO 61기");
		Date dateObject = new Date();
		int number = 100;//<- Integer 인스턴스로 저장됨
		Teacher teacher =  new Teacher("김봉두", 55, "체육");
		
		/*
		 3]객체저장
		 	: add()메소드를 통해 객체가 정상적으로 저장되면
		 	true를 반환한다.
		 */
		System.out.println(set.add(strObject1));//true반환
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);// <- new Integer(number)
		set.add(teacher);
		
		/*
		 4]저장된 객체수 엳기
		 */
		System.out.println("[중복저장전 객체수]:"+set.size());//5개
		
		/*
		 5-1]기본 클래스형 객체 중복저장
		 	: 기본 클래스의 경우에는 별도의 오버라이딩 없이 
		 	중복이 제거된다. 따라서 아래의 경우는 false가 반환된다.
		 */
		System.out.println(set.add(strObject2)? "저장성공" : "저장실패");//저장실패
		System.out.println("[중복(String)저장후 객체수]:"+set.size());//5개
		
		/*
		 5-2]개발자가 정의한 객체 중복저장
		 	: 직접 정의한 클래스인 경우 hashCode, equals메소드를 
		 	오버라이딩 하지 않으면 중복 저장이 허용된다. 아래의 경우
		 	저장에 성공하여 true를 반환된다.
		 */
		Teacher teacher2 =  new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)? "성공" : "실패");//성공
		System.out.println("[중복(teacher2)저장후 객체수]:"+set.size());//6개
		
		/*
		 6]저장된 객체 출력
		 	: 순서없이 저장되므로 출력도 순서를 지정할 수 없다. 
		 */
//		Iterator itr =  set.iterator();
//		while(itr.hasNext()) {
//			Object object = itr.next();
//			
//			if(object instanceof String) {
//				System.out.println("String타입:"+ object);
//			}
//			else if(object instanceof Date) {
//				System.out.println("Date타입:"+ object);
//			}
//			else if(object instanceof Integer) {
//				System.out.println("Int"
//						+ "eger타입:"+ object);
//			}
//			else if(object instanceof Teacher) {
//				System.out.println("Teacher타입:"+ object);
//			}
//			else {
//				System.out.println("넌 뭐 임??-_-;");
//			}
//		}//end of while
		
		//1-7]검색
		System.out.println(set.contains(strObject1)? "strObject1있다"
				: "strObject1없다");
		System.out.println(set.contains("JaVa")? "JaVa있다"
				: "JaVa없다");
		
		//1-8]삭제
		System.out.println(set.remove(strObject2)?
				"strObject2삭제성공" : "strObject2삭제실패");
		System.out.println(set.remove("Android")?
				"Android삭제성공" : "Android삭제실패");
		System.out.println("[삭제 후 객체수]"+ set.size());
		
		//1-9]전체삭제
//		set.clear();
		System.out.println("전체삭제:"+set.removeAll(set));
		System.out.println("[전체 삭제후 객체 수]"+ set.size());
		
	}
}
