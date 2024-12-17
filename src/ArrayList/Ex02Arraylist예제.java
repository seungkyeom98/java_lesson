package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Arraylist예제 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner sc ;
		sc = new Scanner(System.in);
		
		int select =0; //입력받을 숫자 저장공간(=변수)
		String title =""; //입력받을 문자열 저장공간(=변수)
		
		listloop:
		while(true) {
			System.out.println("==현재 재생목록==");
			System.out.println(list);
			System.out.println("현재 인덱스 수: "+list.size());
			System.out.println("=============");
			
			System.out.println("메뉴를 선택해주세요");
			System.out.print("[1]노래추가 [2]노래삭제 [3]종료 >>");
			select = sc.nextInt();
		
			if(select ==1) {
				//추가로직
				System.out.print("추가할 노래 제목 입력 >>");
				title = sc.next();
				System.out.print("추가할 '인덱스 위치(=방 호수)' 입력 >>");
				select =sc.nextInt();
				//list삽입 함수 사용
				list.add(select, title);
				
				//완료 안내문
				System.out.println("노래가 추가되었습니다.");
				System.out.println(list);
			}else if(select==2){
				//삭제로직
				System.out.print("삭제할 노래의 '인덱스 위치(=방 번호)' 입력 >>");
				select =sc.nextInt();
				//list삭제 함수 사용
				list.remove(select);
				//완료 안내문
				System.out.println("노래가 삭제되었습니다.");
				System.out.println(list);
			}else if(select==3){
				//종료
				System.out.println("종료되었습니다.");				
				break listloop;
			}else {
				System.out.println("1,2,3중 골라주세요.");
			}
			
			
		}
		
		//  ln은 line의 줄인말(=준말)이다!
		
		
		
	}

}
