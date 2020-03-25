package ex21jdbc.prepared;

import java.sql.SQLException;

import ex21jdbc.connect.IConnectImpl;

public class UpdateQuery extends IConnectImpl{

	public UpdateQuery() {
		super("kosmo","1234");
	}
	
	@Override
	public void execute() {
		String sql = "UPDATE member "
				+"SET name=?, pass=? "
				+"WHERE id =?";
		try {
			psmt =  con.prepareStatement(sql);
			/*
			 사용자 입력시 exit를 입력할 때까지는 계속 실행되는 형태로 구성 
			 */
			while(true) {
				//인파라미터 설정시 해당 인덱스만 맞으면 순서는 상관없다.
				psmt.setString(3, scanValue("수정할 아이디"));
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("패스워드"));
				
				int affected = psmt.executeUpdate();
				System.out.println(affected+"행이 업데이트 되었습니다.");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		
		new UpdateQuery().execute();
	}
}
