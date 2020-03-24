package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PersonalInfo implements Serializable{
	
	String name;
	transient String myWeight;
	int age;
	transient int mySecretNumber;
	
	public PersonalInfo(String n, String mw, int a, int msn) {
		name = n;
		myWeight = mw;
		age = a;
		mySecretNumber =msn;
	}
	public void showInfo() {
		System.out.printf("이름 :%s%n", name);
		System.out.printf("몸무게 :%s%n", myWeight);
		System.out.printf("나이 :%s%n", age);
		System.out.printf("금고비번 :%d%n", mySecretNumber);
	}
}

public class E12TransientMembers {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("src/ex20io/person.obj"));
			PersonalInfo info = new PersonalInfo("영희", "120kg", 33, 123456789);
			
			System.out.println("인스턴스 생성직후 출력");
			info.showInfo();
			System.out.println("==================");
			out.writeObject(info);
			out.close();
			
			ObjectInputStream in = 
					new ObjectInputStream(new FileInputStream("src/ex20io/person.obj"));
			PersonalInfo reInfo = (PersonalInfo)in.readObject();
			in.close();
			
			System.out.println("인스턴스 복원 후 출력");
			reInfo.showInfo();
		} 
		catch (ClassNotFoundException e) {}
		catch (FileNotFoundException e) {}
		catch (IOException e) {}
	}
}
