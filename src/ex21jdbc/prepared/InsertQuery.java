package ex21jdbc.prepared;

import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class InsertQuery extends IConnectImpl{
	
	public InsertQuery() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			//1. 쿼리문준비 : 값의 세팅이 필요한 부분을 ?로 대체한다.
			String query = "INSERT INTO member VALUES (?, ?, ?, ?)";
			
			//2. prepared객체 생성 : 생성시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//3. DB에 입력할 값을 사용자로부터 입력받음.
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디:");
			String id = scan.nextLine();
			System.out.print("패스워드:");
			String pw = scan.nextLine();
			System.out.print("이름:");
			String name = scan.nextLine();
			
			//4. 인파라미터 설정하기 : ?의 순서대로 설정하고 DB이므로 인덱스는 1부터 시작.
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			
			//psmt.setString(4, "2018-11-20");//날짜를 문자열로 입력하는 경우
			/*
			 현재 날짜를 JAVA단에서 입력하는 경우 아래와 같은 변환과정을 거쳐야한다.
			 util패키지로 시간을 가져온 후 sql패키지 형태로 변환한다.
			 이때는 date형으로 입력되기 때문에 setDate()메소드를 사용해서
			 인파라미터를 설정해야 한다.
			 */
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate =  new java.sql.Date(utilDate.getTime());
			psmt.setDate(4, sqlDate);
			/*
			 인파라미터 설정시 사용하는 메소드
				쿼리문에 ? 가 있는 부분에 인덱스로 접근해서 설정한다.
				자료형이 
					숫자면 setInt()
					문자면 setString()
					날짜면 setDate()를 사용한다.
				해당 메소드 사용시 '(싱글쿼테이션)은 자동으로 삽입된다.
			 */
			
			//5. 쿼리실행을 위해 prepared객체를 실행한다.
			int affected = psmt.executeUpdate();//psmt가 쿼리를 가지고 있기 때문에 인자로 전달 안함
			System.out.println(affected+"행이 입력되었습니다.");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	public static void main(String[] args) {
		
		new InsertQuery().execute();
	}
}
