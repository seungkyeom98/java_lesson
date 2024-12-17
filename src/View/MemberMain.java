package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Model.MemberDTO;
import Controller.MemberDAO;

import java.util.ArrayList;
import java.util.Random;

public class MemberMain {
		//JDBC이용하기 위해선 Ex07MVC프로젝트파일의 properties(=속성)에서 java build path에서 Libraries에서 ClassPath에 Add External JARs을 눌러 ojdbc6을 추가해야한다. 
		//+JRE System Library에 ojdbc6이 있는지 확인하고 없으면, 여기도 properties(=속성)에 들어가서 Installed JREs에 들어가 Edit에 들어가 Add External JARs을 눌러 ojdbc6을 추가하면 된다.
	public static void main(String[] args) {
		// 디자인 패턴
		// : 계속 같은 문제가 발생해서, 이 문제를 해결하고자 형식과 규칙을 지정해놓은 것.
		// : 프로그램 등을 개발할 때, 좀 더 쉽고 편리하게 사용할 수 있게 만든 방법들.

		// MVC 디자인 패턴.(=Model View Controller)
		// - 프로그램을 Model, View, Controller 라는 3가지 요소로 구분하는 개발방법론.

		// Model: 데이터를 저장하고, 조작하기 위한 코드들.
		// View: 사용자에게 직접적으로 보여지는 코드들.
		// Controller: Model과 View 사이에서 데이터 흐름을 제어.

		// 예시: 회원 관리 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.println("======스마트인재개발원 회원관리 프로그램======");

		String choice = ""; // 사용자가 입력한 메뉴번호
		Random ran = new Random();// 랜덤수 쓸수도 있으니까 선언

		programLoop: while (true) {
			System.out.print("[1] 회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원 조회 [5]회원정보 수정 [6]종료 >>");
			choice = sc.next();
			if (choice.equals("1")) {
				//1.회원가입
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
				
				//회원가입에 필요한 정보를 받았으니, 
				//DTO에 정보를 채운다.
				MemberDTO dto= new MemberDTO(id,pw,name,age);
				//DAO(데이터 접근 객체)의 기능(=멤버함수)를 사용하기위해 객체 생성
				MemberDAO dao= new MemberDAO();
				int result = dao.join(dto);
				if (result > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}
				
				
				
			

			} else if (choice.equals("2")) {
				//2.로그인
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
						// 로그인 완료. 게임 시작.

					} else {
						System.out.println("존재하는 회원정보가 없습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();// 원래는 자바의 오류문구만 콘솔창에 빨간글씨로 띄워주는데,
										// 이 멤버 함수로 안뜨는 sql의 오류문구를 빨간글씨로 콘솔창에 띄어준다.
				}

			} else if (choice.equals("3")) {
				//3.회원탈퇴
				System.out.print("id 입력 >>");
				String id = sc.next();
				System.out.print("pw 입력 >>");
				String pw = sc.next();

				//회원탈퇴에 필요한 정보를 받았으니, 
				//DTO에 정보를 채운다.
				MemberDTO dto= new MemberDTO(id,pw);
				//DAO(데이터 접근 객체)의 기능(=멤버함수)를 사용하기위해 객체 생성
				MemberDAO dao= new MemberDAO();
				int result = dao.delete(dto);
				if (result > 0) {
					System.out.println("회원탈퇴 성공!");
				} else {
					System.out.println("회원탈퇴 실패!");
				}

			} else if (choice.equals("4")) {
				//4.전체회원 조회
				System.out.println("ID \t 이름 \t 나이 \t");
				//회원조회(select)는 전달할 데이터가 없어서
				//dto가 필요없다.
				
				// dao객체 필요
				MemberDAO dao = new MemberDAO();
				
				ArrayList<MemberDTO> list =dao.selectAll();
				
				//for-each문: 배열의 크기만큼 반복되는 반복문
				for(MemberDTO dto : list) {
					System.out.print(dto.getId()+"\t");
					System.out.print(dto.getName()+"\t");
					System.out.println(dto.getAge()+"\t");
				}

			}else if (choice.equals("5")) {
				//5.회원정보 수정
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

			}else if(choice.equals("6")) {
				//6.종료
				System.out.println("프로그램을 종료합니다.");
				break programLoop;
			}else {
				System.out.println("1,2,3,4,5,6 중 입력해주세요.");
			}

		} // programLoop: while(true)
	}

}
