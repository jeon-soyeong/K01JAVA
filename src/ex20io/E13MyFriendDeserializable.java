package ex20io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class E13MyFriendDeserializable {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream in = 
					new ObjectInputStream(new FileInputStream("src/ex20io/friend_info.obj"));
	
			while(true) {
				//저장된 파일에서 정보 1개 읽어오기
				Friend friend =(Friend)in.readObject();
				//만약 읽어올 정보(객체)가 더이상 없다면 루프 탈출
				if(friend==null) break;
				//읽어온 객체를 통해 정보출력
				friend.showAllData();
			}
			
			while(true) {
				Friend friend =(Friend)in.readObject();
				if(friend==null) break;
				friend.showAllData();
				
			}
		}
		catch (Exception e) {
//			e.printStackTrace();
		}
	}
}
