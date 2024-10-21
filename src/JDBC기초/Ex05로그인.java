package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05로그인 {

	public static void main(String[] args) {
		
		//0. 사용자에게 로그인하고싶은 id, pw 입력받고
		
		//1. try~catch안에서
		//2. 드라이버 로딩
		//3. DB 연결
		//4. 미완성 sql에 정보 넣고
		//5. select문 실행
		//6. 결과를 ResultSet rs = psmt.executeQuery();에 담기 까지!
		
		//선언부(1변수 선언, 2클래스와 3배열과 4인터페이스의 레퍼런스 변수 선언)
		Scanner sc = new Scanner(System.in);
		String id;
		String pw;
		String URL;
		String USER;
		String PASSWORD;
		String sql;
		
		Connection conn;		//커넥션의 줄임말(=준말), conn으로 레퍼런스 변수를 선언한다
		PreparedStatement psmt; //p스테이트먼트라고 줄여 말하기 위해, psmt라 줄여 붙인 변수명이다.
		ResultSet rs;
		
		// main기능=메소드=멤버함수 시작!
		System.out.print("아이디를 입력하세요 >>");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요 >>");
		pw = sc.next();
		
		try {
			//1.드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.DB연결
			URL= "jdbc:oracle:thin:@localhost:1521:xe";
			USER="nthnew";
			PASSWORD="12345";
			
			conn= DriverManager.getConnection(URL, USER, PASSWORD);
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			//3.쿼리 작성
			sql= "SELECT * FROM DCXSTU WHERE ID=? AND PW=?";
			psmt= conn.prepareStatement(sql);//작성된 쿼리를 prepareStatement의 객체에 저장한다
			psmt.setString(1, id);
			psmt.setString(2,pw);
			
			//4.쿼리 전송
			rs=psmt.executeQuery();
			//5.쿼리 결과 처리
			//rs.next()return형태(=타입)은 boolean자료형태이다.
			//그래서 re.next()의 조회결과가 여러 행(=튜플)이면, while문으로 돌린다.(Ex04회원조회처럼)
			//=>한번 반복할 때마다, 계속 그 다음 행으로 넘어가서 실행
			//	마지막행까지 실행하면 끝
			
			if(rs.next()) {
			System.out.println(rs.getString("NAME")+"님 환영합니다.");
			}else {
				System.out.println("존재하는 회우너정보가 없습니다.");
			}
			
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();// 원래는 자바의 오류문구만 콘솔창에 빨간글씨로 띄워주는데,
								// 이 멤버 함수로 안뜨는 sql의 오류문구를 빨간글씨로 콘솔창에 띄어준다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
