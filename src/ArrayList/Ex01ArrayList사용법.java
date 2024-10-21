package ArrayList;

import java.util.ArrayList;

public class Ex01ArrayList사용법 {


	public static void main(String[] args) {
		//ArrayList
		//-배열의 상위호환, 
		//-데이터를 여러개 담을 수 있는 자료구조의 일종
		//자료구조와 알고리즘 정처기와 코테를 위해 공부하자!
		
		
		//ArrayList의 특징
		//-다른 자료형끼리도 저장이 가능
		//-들어가 있는 데이터의 크기만큼 길이가 맞춰진다(가변적)
		//=>추가/삭제 가능
		//-*****데이터사이에NULL인덱스가 자동적으로 사라진다.*****
	
		//ArrayList 만들기
		ArrayList list = new ArrayList();
		
		//데이터 추가 - add()
		list.add("미리");
		list.add("희진");
		
		//데이터 중간 삽입
		list.add(1,"승겸"); //list란 배열리스트에 1번 인덱스에 넣고,
							//기존 1번 인덱스에 있던 원소값은 
							//2번 인덱스로 밀어낸다!
		
		list.add("재영");		//add함수 2개는
		list.add(1, "가을이");//함오버 로딩이다! 함수명은 같지만,	
							//매개변수 개수가 다른
		//list.add로 입클리스에 검색했을때, 
		//list.add의 또다른 오버로딩의 함수는 없었다.
		//그러므로, list.add메소드(=멤버 함수)는 
		//위2방식이외에 다른 오버 로딩인 
		//예를들어, list.add(1,"재영",2);는 안된다!
		//내장 멤버 함수(=메소드)중 저렇게 선언된 내장 메소드는 없기 때문이다.
		//객체의 구성요소로, 멤버 변수와 멤버 함수를 선언!할수 있다.
		//멤버 변수=필드, 멤버 함수= 메소드 이다.
		
		
		
		//리스트 출력
		System.out.println(list);
		
		//특정 인덱스 요소 알아내기
		System.out.println(list.get(0));   //getter함수. 특정 인덱스의 요소를 알아낼때 사용하는게 getter함수이다.
		
		//특정 인덱스 요소 삭제하기
		list.remove(0);  //특정 인덱스의 요소를 삭제할때 쓰는 remove함수.
		
		//특정 인덱스 요소 수정하기
		list.set(3, "정환");
		System.out.println(list);  //setter함수
		
		//리스트의 모든 요소 삭제하기
		list.clear();
		System.out.println(list);
		
		//리스트의 길이 구하기
		//ArrayList list ; 				//배열리스트 선언!(=레퍼런스 변수 생성(=선언))
		//list = new ArrayList();		//배열리스트 생성!(new 생성연산자 활용)
		list.size();
		System.out.println(list.size());
		
		//그냥 배열의 길이 구하기
		//String arr[] ;				//배열 선언!=배열의 레퍼런스 변수 선언!(=생성)
		//arr[] = new String[3];		//이클립스에 내장된 배열 클래스에 생성자 메소드를 실행? 한 것이다.
		//arr.length();					//배열 생성자는 오버로딩없이, 반드시 매개변수가 필요하다?
		
//		---------------------------------------------	
//		
//		String rev="+";
//		String temp="*";
//		String names[]= {"김", "Park", "Yi"}; 
//		//향상된 확장 for반복문으로 출력
//		for(String str:names) {
//			rev=str+rev;  //앞으로 대입
//			temp=temp+str;//뒤로 대입
//			System.out.print(str+"~");
//		}
//		System.out.print("\n");
//		System.out.println(rev);
//		System.out.println(temp);
//		
//		
//		-----------------------------------------------
		
		
	}

}
