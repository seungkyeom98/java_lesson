package 클래스_객체_설계도_오브젝트;

public class Ex02Bank {
	//속성-필드
	//프라이빗: 접근제한자, 외부 파일(=클래스, 메인 설계도의 메소드(기능))에서 
	// 		 이 속성 값(=데이터)를 바꾸지 못하게 하는 용도이다!
	private static int money; //int cash; 잔액
	
	//전역변수
	
	
	//기능-메소드
	
	//잔액조회
	public static int showmoney() {
		//지역변수
		return money;
	}
	
	//입금 기능
	public void deposit(int m) {
		money = money+m;
		System.out.println("입금 완료");
	}

	//출금 기능
	public void withdraw(int a) {
		if(money>=a) {
			money = money-a;
			System.out.println("출금 완료");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
}
