package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.MemberDTO;

// 예시: 회원 관리 프로그램
public class MemberDAO {
	// DAO(Data Access Object)
	// -데이터에 접근하는 것을 도와준다!

	// -DB에 연결해서 insert, delete, update, select 기능을 할 수 있는 멤버함수(=메소드) 모음집.
	// -각각의 기능 멤버함수를 여기에 만들 것이다.

	String sql ="";
	PreparedStatement psmt;
	Connection conn;
	
	// 디비연결 멤버함수
	public void connection() {
		try {
			// 1.DB드라이버꺼내기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.DB-Java연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			this.conn = DriverManager.getConnection(url, user, password);

			
			if (conn != null) {
				System.out.println("DB 연결 성공!!");
			} else {
				System.out.println("DB 연결 실패~");
			}
		} catch (Exception e) {

		}
	}

	// 회원가입 멤버함수(MemerDAO의 멤버함수)
	public int join(MemberDTO dto) {
		int result = 0;
		try {
			connection();
			// 3.쿼리문 전송
			
			String sql= "INSERT INTO DCXSTU VALUES(?, ?, ?, ?)";

			this.psmt = conn.prepareStatement(sql);
			
			this.psmt.setString(1, dto.getId());
			this.psmt.setString(2, dto.getPw());
			this.psmt.setString(3, dto.getName());
			this.psmt.setInt(4, dto.getAge());
			// [3-3]쿼리 전송

			result = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;

	}
	
	//회원탈퇴
	public int delete(MemberDTO dto) {
		int result = 0;
		try {
			connection();
			// [3] 쿼리 작성
			String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}
	
	public ArrayList<MemberDTO> selectAll() {
		
		//MemberDTO 타입의 객체 배열 생성
		//- arraylist처럼 길이가 가변적
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
			// 1.드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);
			//3.쿼리작성
			String sql = "select * from DCXSTU";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs= psmt.executeQuery();
			
			//ResultSet 형태로 되어있는 결과물을 객체배열형태로 저장
			while(rs.next()) {
				//rs에 있는 데이터를 하나씩 빼서
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				
				//dto객체에 생성자 인자로 넘겨서 객체 생성
				MemberDTO dto = new MemberDTO(id,name,age);
				
				//그 생성한 개게 객체배열에 저장해서 관리
				list.add(dto);
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
		
	}
	
	
	

}
//메소드-Controller-DAO-access
//메코 = 메소드-콘트롤러-DAO 줄여서 메코라고 외우자!
