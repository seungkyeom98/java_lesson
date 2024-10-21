package 클래스_객체_설계도_오브젝트;

import java.util.Scanner;

public class Ex031다마고치2 {

	public static void main(String[] args) {
		// 다마고치 게임 만들기
		
		//1. 시작메뉴
		//-내 다마고치 상태 확인하기 
		//-밥주기
		//-재우기
		//-놀아주기
		//-다마고치 초기화하기
		//-종료하기
		int choice =0;
		Scanner sc = new Scanner(System.in);
		Ex031Poket dama = new Ex031Poket();
		System.out.println(".　∧∧\r\n"
				+ "　(｢･ω･)｢ \r\n"
				+ "　/　/\r\n"
				+ "`ノ￣ゝ 포켓로그(로그라이크 50층오르기게임)! ∧_∧\r\n"
				+ "				 (`･ω･´) 三\r\n"
				+ "				  O┳〇)\r\n"
				+ "	 		 	　◎し◎- 三");
		
		dama.decideName();
		
		//전투 시작!
		loop1: while(true) {
			System.out.println();
			System.out.println("1상태확인 2밥주기 3재우기 4놀아주기 5환경설정");
			System.out.print("메뉴를 선택하세요 >>");
			choice = sc.nextInt();
			if(choice==1) {
				System.out.println("다마고치의 상태는 다음과 같습니다.");
				dama.condition();
			}else if(choice==2) {
				dama.eat();
				System.out.println("다마고치가 배부릅니다.");
			}else if(choice==3) {
				dama.sleep();
				System.out.println("다마고치가 개운합니다.");
			}else if(choice==4) {
				dama.play();
				System.out.println("다마고치가 즐거워 합니다.");
			}else if(choice==5) {
				loop2 : while(true) {
					System.out.println("1이름 변경 2리셋 3게임 종료");
					System.out.print("메뉴를 선택하세요 >>");
					choice = sc.nextInt();
					if(choice==1) {
						//이름변경
						dama.changeName();
						break loop2;
					}else if(choice==2) {
						//리셋
						dama.reset();
						System.out.println("게임을 다시 시작합니다.");
						break loop2;
					}else if(choice==3) {
						System.out.println("게임을 종료합니다.");
						break loop1;//게임 종료
					}else {
						System.out.println("123중 선택해주세요");
					}
				}
			}else {
				System.out.println("12345중 선택해주세요");
			}
			
		}
		
		
		
		
	}

}
