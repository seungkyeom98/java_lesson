package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.Random;

public class Ex07코드합치기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice;
		Random ran = new Random();

		programLoop: while (true) {
			System.out.println("게임에 접속해주셔서 감사합니다!");
			System.out.print("[1] 회원가입 [2]회원탈퇴 [3]정보수정 [4]회원조회 [5]로그인 >>");
			choice = sc.next();
			if (choice.equals("1")) {
				// 회원가입
				System.out.print("id 입력 >>");
				String id;
				id = sc.next();
				System.out.print("pw 입력 >>");
				String pw;
				pw = sc.next();
				System.out.print("이름 입력 >>");
				String name = sc.next();
				System.out.print("나이 입력 >>");
				int age = sc.nextInt();

				try {
					// [1] 'JDBC 드라이버'(=API의 한종류) 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// [2] DBMS에 연결
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "nthnew";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url, user, password);
					if (conn != null) {
						System.out.println("DB 연결 성공!!");
					} else {
						System.out.println("DB 연결 실패~");
					}
					// [3]쿼리 전송
					String sql = "INSERT INTO DCXSTU VALUES(?, ?, ?, ?)";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, name);
					psmt.setInt(4, age);
					// [3-3]쿼리 전송
					int result;
					result = psmt.executeUpdate();
					if (result > 0) {
						System.out.println("회원가입 성공!");
						System.out.println(result);
					} else {
						System.out.println("회원가입 실패!");
						System.out.println(result);

					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				break programLoop;
			} else if (choice.equals("2")) {
				// 회원탈퇴
				System.out.print("id 입력 >>");
				String id = sc.next();
				System.out.print("pw 입력 >>");
				String pw = sc.next();

				try {
					// [1] 'JDBC 드라이버'(=API의 한종류) 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// [2] DBMS에 연결
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "nthnew";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url, user, password);
					if (conn != null) {
						System.out.println("연결성공");
					} else {
						System.out.println("연결실패");
					}
					// [3] 쿼리 작성
					String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					int result = psmt.executeUpdate();
					if (result > 0) {
						System.out.println("회원탈퇴 성공!");
						System.out.println(result);
					} else {
						System.out.println("회원탈퇴 실패!");
						System.out.println(result);

					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				break programLoop;
			} else if (choice.equals("3")) {
				// 정보수정
				System.out.print("아이디를 입력하세요 >>");
				String id = sc.next();
				System.out.print("비밀번호를 입력하세요 >>");
				String pw = sc.next();
				System.out.print("새 나이를 입력하세요 >>");
				int age = sc.nextInt();

				try {
					// 1. 드라이버
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 2. DB연결
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "nthnew";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url, user, password);
					if (conn != null) {
						System.out.println("연결성공");
					} else {
						System.out.println("연결실패");
					}
					// 3. 쿼리 작성
					String sql = "UPDATE DCXSTU SET AGE=? WHERE ID=? AND PW=?";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setInt(1, age);
					psmt.setString(2, id);
					psmt.setString(3, pw);
					// 4. 쿼리 전송
					int result;
					result = psmt.executeUpdate();
					if (result > 0) {
						System.out.println("회원정보 수정 성공!");
					} else {
						System.out.println("회원정보 수정 실패!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break programLoop;
			} else if (choice.equals("4")) {
				// 회원조회
				try {
					// 1.드라이버
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 2.DB연결
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "nthnew";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url, user, password);
					if (conn != null) {
						System.out.println("연결성공");
					} else {
						System.out.println("연결실패");
					}
					// 3.쿼리작성
					String sql = "SELECT * FROM DCXSTU ";
					PreparedStatement psmt = conn.prepareStatement(sql);
					// 4.쿼리전송
					ResultSet rs = psmt.executeQuery();
					// 5.결과출력
					System.out.println("===전체 유저 조회===");
					while (rs.next()) {
						String id = rs.getString("ID");
						String name = rs.getString("NAME");
						int age = rs.getInt("AGE");
						System.out.println(id + "\t" + name + "\t" + age);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break programLoop;
			} else if (choice.equals("5")) {
				// 로그인
				System.out.print("아이디를 입력하세요 >>");
				String id = sc.next();
				System.out.print("비밀번호를 입력하세요 >>");
				String pw = sc.next();

				try {
					// 1.드라이버
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 2.DB연결
					String URL = "jdbc:oracle:thin:@localhost:1521:xe";
					String USER = "nthnew";
					String PASSWORD = "12345";
					Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
					if (conn != null) {
						System.out.println("연결 성공");
					} else {
						System.out.println("연결 실패");
					}
					// 3.쿼리 작성
					String sql = "SELECT * FROM DCXSTU WHERE ID=? AND PW=?";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					// 4.쿼리 전송
					ResultSet rs = psmt.executeQuery();
					if (rs.next()) {
						System.out.println(rs.getString("NAME") + "님 환영합니다.");
						//로그인 완료. 게임 시작.
						
					} else {
						System.out.println("존재하는 회원정보가 없습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();// 원래는 자바의 오류문구만 콘솔창에 빨간글씨로 띄워주는데,
										// 이 멤버 함수로 안뜨는 sql의 오류문구를 빨간글씨로 콘솔창에 띄어준다.
				}
				break programLoop;
			} else {
				System.out.println("1,2,3,4,5 중 선택해주세요");
			}//if문 [1] 회원가입 [2]회원탈퇴 [3]정보수정 [4]회원조회 [5]로그인
		}//programLoop: while(true)

	}//main 메소드(=멤버 함수)

}//Ex07코드합치기 클래스.
