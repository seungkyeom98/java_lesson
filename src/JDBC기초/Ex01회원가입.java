package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01회원가입 {

	public static void main(String[] args) {
		
		Scanner sc ;

		
		sc = new Scanner(System.in);
		
		//JDBC 
		//회원가입 예제
		//1. 사용자에게 id, pw, 이름, 나이
		System.out.print("id 입력 >>");
		String id;
		id = sc.next(); 
		//sc.nextline()은 띄어쓰기도 받을 수 있는데
		//아이디와 비번, 이름,나이는 공백 띄어쓰기를 받으면 안되므로,
		//sc.next()를 이용한다!
		System.out.print("pw 입력 >>");
		String pw;
		pw = sc.next(); 
		System.out.print("이름 입력 >>");
		String name = sc.next(); 
		System.out.print("나이 입력 >>");
		int age = sc.nextInt(); 
		

		try {
			//예외처리=예외사항처리
			//try구문: 에러가 발생할 수도 있지만, 일단 한번 실행하는 공간
			//서버나 프로그램을 배포했을떄, 오류떠서, 중간에 멈추지 않고, catch실행될수있게
			//오류에 대한 예외를 catch를 실행할 수 있게 하기 위해 try앤 catch로 전체 문법을 묶는 거다
			//오류로 서버와 프로그램이 안멈추기 위해서 말이다!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//[1] 'JDBC 드라이버'(=API의 한종류) 로딩
			//드라이버 뜻: 자바에서 제공하는 '인터페이스'들을 클래스 파일의 모음집
			//디비의 DBMS=오라클=MySQL회사에서 제공한다
			//드라이버: java에서 제공하는 인터페이스들을 DB회사에서 로직을 구현하는 클래스 파일이 모여있는 모음집
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DBMS의 문법을 SQL(= 스트럭쳐 쿼리 랭귀지)로 적는다.
			
			
			//[2] DBMS에 연결
			//준비물3가지: 연결 경로, 데이터베이스의 ID, PW
			
			//준비물1.연결 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//thin : JDBC 드라이버 타입이 thin타입
			//@localhost : ip주소
			//1521 : 포트번호
			// xe: DB별칭
			
			//준비물2. 디비의 ID
			String user = "nthnew";
			
			//준비물3. 디비의 PW
			String password = "12345";
			
			//System.out.println(0);////디버깅 위한 코드
			//인터페이스
			Connection conn = DriverManager.getConnection(url,user,password); //이거 왜 오류 안뜨냐, 예외처리 문법인 try앤catch문법에 e.printStackTrace();를 써주면, jdbc6파일의 클래스들에 대한 sql오류를 콘솔창에 띄어준다. 
			// 근데 오류 뜨면, 왜 뜨는 지 알려주는게  e.printStackTrace();인거고, catch됐을때, 프로그램과 서버가 안 꺼지기위해선 전체 while(true)를 걸어주면 되는 건가? 
			//-> 무중단 배포 프로그램or서버일떄 말이다.
			//
			//->연결이 성공하면, conn안에 무언가 담기고,
			//연결이 실패하면, conn안에 아무것도 안담기는 자바 내장 맴버 함수(=메소드)이다.
			//System.out.println(1);////디버깅 위한 코드
			
			if(conn != null) {
				System.out.println("DB 연결 성공!!");
			}else {
				System.out.println("DB 연결 실패~");
			}
			
			//[3]쿼리 전송
			//[3-1]쿼리문 준비
			//String sql;
			//sql = "INSERT INTO DCXSTU VALUES(?, ?, ?, ?)";
			String sql = "INSERT INTO DCXSTU VALUES(?, ?, ?, ?)";
			
			// ?라는 매개변수(=인자=원소)는
			// 어떤 값이 들어갈지 모르기 때문에 값을 넣어줄 때까지 대기
			
			
			//[3-2]쿼리문 전송 준비
			PreparedStatement psmt = conn.prepareStatement(sql);
	
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
		
			//[3-3]쿼리 전송
			int result ;
			result = psmt.executeUpdate();
			//executUpdate()멤버 함수(=메소드)는전송이 됐는지 안됐는지 결과를 리턴해준다. 
			//executUpdate(): DBMS=오라클의 insert, delete, update같은 DML기능을 해주는 메소드이다.
			//executQuery(): 오라클의 select문법(=조회 문법)을 전송하는 멤버 함수(=메소드=기능=로직)이다.
			if (result >0) {
				System.out.println("회원가입됐습니다.");
			}else {
				System.out.println("회원가입 실패했습니다.");
			}
			
			
			
			
		}catch(Exception e){ //예외사항 처리 = 예외처리
			//모든 오류는 Exception타입(=형태=형)으로 되어있다.
			//모든 예외는 Exception이라는 클래스를 상속받는다.
			//예를들어 
			//Exception e ; //클래스의 객체 선언
			//Exception e = new classNotFoundException();
			//Exception e = new SQLException();
			// ---> 업스캐팅이다. classNotFoundException 클래스 자료형과 
			//				  SQLException 클래스 자료형 중 어느 클래스의 자료형이 올 수 있도록
			//				이 2개의 부모 클래스 자료형으로 선언하는 것을 업스캐팅이다.
			//				자식 클래스가 아닌 부모 클래스로 자료형을 선언하는 것을 업스캐팅이다
			//		 업스캐팅 : 2개의 자식 클래스 자료형을 모두 가능하게하기 위해 부모 클래스로 선언하는 것 
			
			//catch 구문
			//예외상황(에러)이 발생했을 때, 어떤 로직을 수행할지 정해주는 공간
			//System.out.println("알 수 없는 오류가 발생했습니다");
			 e.printStackTrace();
			//예외상황이 왜 발생했는지, 어디서 문제가 발생했는지 출력해주는 구문
			//클래스가 다르다. sql이 다르다. scanner의 자료형이 다르다 이들의 클래스가 모두 다르다
			//exception이 위 모든 오류들의 부모 클래스이다. (인터페이스는 아니라고 한다.)
			//그래서 부모 클래스인 exception으로 업캐스팅(=객체의 자료형을 자식클래스에서 부모클래스로 바꾼다.)하는 것이다.
			 
			 //인터페이스는 멤버함수의 오버라이드할때만 쓰는 거기 때문에, 
			 //업캐스팅으로 클래스형을 모두 일치 시켜주기 위해선
			//업캐스팅으로 부모클래스와 자식클래스의 상속관계 extends여야 한다.
			// implements로 인터페이스의 추상멤버함수만 상속받는게 아니고,
			//객체 자체의 자료형태(자료형=dataType)를 부모클래스로 상속받아야 하기 때문에
			//인터페이스가 아닌 '부모클래스'여야 한다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
