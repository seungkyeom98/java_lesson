package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex04회원조회 {

	
	
	
	public static void main(String[] args) {
		
		Connection conn ; //객체(=객체의 레퍼런스 변수) 선언
		PreparedStatement psmt ; //객체 선언
		int result;//변수 선언
		
		
		//try구문 안에 드라이버 로딩하고 db연결하는거까지
		try {
			
			//1.드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			// 3. 쿼리 작성
			String sql = "SELECT * FROM DCXSTU ";
						

			psmt = conn.prepareStatement(sql); //할당	//작성된 쿼리를 prepareStatement의 객체에 저장한다	
//			psmt.setInt(1, age);
//			psmt.setString(2, id);
			//4. 퀴리 전송
			//ResultSet 클래스의 객체: JDBC에서 쿼리 결과를 저장하고, 처리할 수 있도록 도와줌
			ResultSet rs= psmt.executeQuery();
			
			//5. 결과를 이용한 작업 처리
			//>> 사용자에게 어떤 모습을 보여줄지 정의
			
			System.out.println("===전체 유저 조회===");
			while(rs.next()) {
				String id= rs.getString("ID");
				String name= rs.getString("NAME");
				int age = rs.getInt("AGE");
				System.out.println(id+"\t"+name+"\t"+age);
				
				
				
			}
			
			
			
		}catch(Exception e){
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
