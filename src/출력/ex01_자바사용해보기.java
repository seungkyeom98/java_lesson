package 출력;

// 주석 : 컴파일 과정에 영향을 끼치지 않는 구문 (구문 앞쪽에 슬래시 두개)
//컴파일(complie) : 작성한 코드를 컴퓨터가 알아먹을 수 있게 (0,1)인 2진법 기계어로 변화시키는 과정.

public class ex01_자바사용해보기 {

		//매인 매소드 (메인기능) : 이 프로그램의 시작점
		public static void main(String[] args) {
			//프로그램의 시작점은 main method 안이기 때문에 코드는 main 안쪽에서 적자!
//			System.out.println("Hello World!");
//			//출력 자동완성 : syso + ctrl + space -> sysout 찾아서 엔터
//			System.out.println("");
//			//프로그램 실행시키는 단축키 : Ctrl +F11
//			//실행시키면 console 탭에 출력문이나 오류 메세지가 나온다!
//			
//			
//			int ar[];
//			ar= new int[5];
//			
//			System.out.println(ar);
//			
//			int a=1;
//			System.out.println(a);
//			
			String rev="+";
			String temp="*";
			String names[]= {"김", "Park", "Yi"}; 
			//향상된 확장 for반복문으로 출력
			for(String str:names) {
				rev=str+rev;  //앞으로 대입
				temp=temp+str;//뒤로 대입
				System.out.print(str+"~");
			}
			System.out.println("\n"+rev);
			System.out.println(temp);
	}

}



















