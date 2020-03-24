package ex17collection;

import java.util.HashSet;

import common.Person;

public class Ex04HashSet2 {

	public static void main(String[] args) {
	
		HashSet<Person> hashSet = new HashSet<Person>();
		
		Person p1 = new Person("정우성", 30);
		Person p2 = new Person("장동건", 40);
		Person p3 = new Person("정우성", 30);
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		System.out.println("p3 객체 저장여부:"+b);
		
		System.out.println("HashSet에 저장된 객체수:"+ hashSet.size());

	}
}
