package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02회원탈퇴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력 >>");
		String id = sc.next();
		System.out.print("pw 입력 >>");
		String pw = sc.next();

		try {
			// [1] 'JDBC 드라이버'(=API의 한종류) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DBMS의 문법을 SQL(= 스트럭쳐 쿼리 랭귀지)로 적는다.
			// [2] DBMS에 연결
			// 준비물3가지: 연결 경로, 데이터베이스의 ID, PW
			// 준비물1.연결 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// thin : JDBC 드라이버 타입이 thin타입
			// @localhost : ip주소
			// 1521 : 포트번호
			// xe: DB별칭
			// 준비물2. 디비의 ID
			String user = "nthnew";
			// 준비물3. 디비의 PW
			String password = "12345";
			// 인터페이스
			Connection conn = DriverManager.getConnection(url, user, password); // 이거 왜 오류 안뜨냐, 예외처리 문법인 try앤catch문법에
																				// e.printStackTrace();를 써주면, jdbc6파일의
			//------------------여기까진 항상 똑같다																// 클래스들에 대한 sql오류를 콘솔창에 띄어준다.

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			//[3] 쿼리 작성
			//회원탈퇴 -> delete
			String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			int result = psmt.executeUpdate();
			if(result>0) {
				System.out.println("회원탈퇴 성공!");
				System.out.println(result);
			}else {
				System.out.println("회원탈퇴 실패!");
				System.out.println(result);

			}
			
			
		} catch (Exception e) { // 예외사항 처리 = 예외처리

			e.printStackTrace();
			// jdbc에서 예외상황이 왜 발생했는지, 어디서 문제가 발생했는지 출력해주는 구문
			// 이걸 안해주면, java내부 아닌 오류는 출력을 안해줄때도 있다.

		}

	}

}
