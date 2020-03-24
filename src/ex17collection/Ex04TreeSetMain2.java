package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
TreeSet<T> 컬렉션
-트리라는 자료구조를 기반으로 한 Set컬렉션이다.
-Set의 기본적은 특성은 동일하나, Tree알고리즘을 통해 정렬되어
저장된다. 정렬의 기준은 개발자가 직접 정의할 수 있다.
-정렬의 기준을 정하기위해  Comparable<T> 인터페이스를 
구현해야 한다. 
 */
class MyString1 implements Comparable<MyString> {
	
	String str;
	public MyString1(String str) {
		this.str = str;
	}
	
	//문자열의 길이를 반환한다. 
	public int getLength() {
		return str.length();
	}

	/*
	정렬의 기준을 위해 오버라이딩 한 메소드로 
	가나다와 같은 사전순, 문자열의 길이등 다양하게 설정 가능하다.
	아래 코드는 오름차순(작은것->큰것) 정렬일때 사용한다. 
	1과 -1의 위치가 바뀌면 내림차순이 된다. 
	 */
	@Override
	public int compareTo(MyString paramStr) {
		//정렬의 순서는 문자열의 길이를 기준으로 한다.
		if(getLength() > paramStr.getLength())
			return 1;
		else if(getLength() < paramStr.getLength())
			return -1;
		else
			return 1;
		
		
	}
	@Override
	public String toString() {
		return str;
	}
}

public class Ex04TreeSetMain2 {

	public static void main(String[] args) {

		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		System.out.println(tree1.add(2));//Set은 중복저장 허용하지 않음.

		System.out.println("저장된 데이터 수:"+ tree1.size() +"개");//4개

		Iterator<Integer> itr1 = tree1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		/**********************************************************/
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("KOSMOAB"));
		tree2.add(new MyString("KOSMO61"));
		tree2.add(new MyString("KOSMO62"));
		
		//문자열의 길이를 기준으로 오름차순 정렬된다. 
		Iterator<MyString> itr2 = tree2.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
}
