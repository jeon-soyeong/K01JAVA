package ex21jdbc.statement;

import java.sql.SQLException;

public class SelectSQL2 extends ConnectDB{
	
	//생성자메소드
	public SelectSQL2() {
		super();
	}
	
/*
 ResultSet 클래스
 	: select문 실행시 쿼리의 실행결과가 ResultSet객체에 저장된다.
 	결과로 반환된 레코드의 처음부터 마지막까지 next()메소드를 통해
 	확인 후 반복하면서 추출하게 된다.
 	
 	-getXXX()계열의 메소드
 	오라클 자료형이
 		number타입 : getInt()
 		char/varchar2타입 : getString()
 		date타입 : getDate()
 		메소드로 각 컬럼의 데이터를 추출한다.
 	-인자는 select절의 컬럼순서대로 인덱스(1부터 시작)를 사용하거나
 	컬럼명을 사용할 수 있다.
 	-자료형에 상관없이 getString()으로 모든 데이터를 추출할 수 있다.
 */
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String query = "SELECT id, pass, name, "
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') format1,"
					+ " regidate "
					+ " FROM member	"
					+ " ORDER BY regidate DESC";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				/*
				날짜를 to_char()함수를 이용해서 문자형으로 변환하였으므로
				추출시  getDate()를 사용할 수 없다. 그리고 컬럼명 대신
				별칭을 사용한다.
				 */
				String regidate = rs.getString("format1");
				
				/*
				오라클의 date형을 getString()으로 추출하면
				2020-03-25 11:46:54 형태로 시간까지 출력할 수 있다.
				만약 날짜 문자열을 잘라서 출력하고 싶을 때는 substring()을 
				활용한다.
				 */
//				String regidate2 = rs.getString("regidate");
				String regidate2 = 
					rs.getString("regidate").substring(0,13);/*
						날짜와 시간까지만 잘라서 출력(분 이후 출력되지 않음)
					*/
				
				System.out.printf("%-10s %-10s %-13s %-20s %-20s\n",
						id, pw, name, regidate, regidate2);
			}
		} 
		catch (SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();//DB자원반납
		}
	}
	
	
	public static void main(String[] args) {
		
		SelectSQL2 selectSQL1 =  new SelectSQL2();
		selectSQL1.execute();
	
	}

}
