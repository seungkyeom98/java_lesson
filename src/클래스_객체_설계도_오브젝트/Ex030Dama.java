package 클래스_객체_설계도_오브젝트;

import java.util.Scanner;

public class Ex030Dama {

	//데이터- 속성= 필드
	//- 체력(health), 행복도(happy)
	private int health= 80;
	private int happy= 50;
	private String name="아무개";//홍길동
	Scanner sc= new Scanner(System.in);
	private String temp ="홍길동";
	
	//기능- 활동= 메소드
	//-상태확인(condition), 밥(eat), 잠(sleep), 놀기(play)
	// show라고 해도됨. 상태확인
	public void condition() {
		System.out.println("체력은 "+health+"이고, 행복도는 "+happy+"입니다.");
	}
	//- 밥: 체력+5
	public void eat() {
		this.health+=5;
		//this키워드: 자기 자신을 의미. 메소드에 속성(필드,데이터)를 사용할때, 
		//this를 붙이면, 코딩때 다른 속성에 데이터를 넣는 오류를 막을 수 있는 좋은 습관이다!
		//이 클래스의 health를 이용하겠단 의미
		System.out.println("다마고치가 밥을 먹고 체력이 5올랐습니다.");
	}
	//- 잠: 체력+10, 행복도-20
	public void sleep() {
		this.health+=10;
		this.happy-=20;
		System.out.println("다마고치가 잠을 자고 체력이 10오르고, 행복도가 20떨어졌습니다.");
	}
	//- 놀기: 체력-20, 행복도 +30
	public void play() {
		this.health-=20;
		this.happy+=30;
		System.out.println("다마고치가 놀고나서 체력이 20떨어지고, 행복도가 30올랐습니다.");
	}
	//- 초기화: 체력, 행복도 데이터 초기화
	public void reset() {
		health=80;
		happy=50;
		System.out.println("다마고치를 처음 상태로 되돌립니다.");
	}
	
	public void decideName() {
		System.out.print("이름을 설정해주세요 >>");
		name = sc.next();
		System.out.println(name+"와 여행을 시작합니다!");// 모험을 시작합니다!
	}
	
	public void changeName() {
		System.out.println("");
	}
	
	//설정 메뉴 따로 while문 안쪽에 만들어서, 이름 변경하기
	
	
}
