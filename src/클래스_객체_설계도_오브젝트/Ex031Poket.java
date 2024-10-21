package 클래스_객체_설계도_오브젝트;

import java.util.Random;
import java.util.Scanner;

public class Ex031Poket {

	//데이터- 속성= 필드
	//- 체력(health), 공격력(attack)(happy), 방어력(shield)
	private int health= 80;
	private int attack= 50;
	private int shield = 30;
	private String name="아무개";//홍길동
	Scanner sc= new Scanner(System.in);
	private int changeHealth =0;
	private int changeAttack =0;
	Random ran = new Random();
	//기능- 활동= 메소드
	//-상태확인(condition), 밥(eat), 잠(sleep), 놀기(play)
	// show라고 해도됨. 상태확인
	
	
	public void condition() {
		System.out.println("╔════════ °• ♔ •° ════════╗\r\n"
				+ "    체력: "+this.health+"이고, 공격력: "+this.attack+"\r\n"
				+ "╚════════ °• ♔ •° ════════╝");
	}
	//- 밥: 체력+5
	public void eat() {
		changeHealth=ran.nextInt(3)+4;
		this.health+=changeHealth;//(0~3)+4-> (4~7)
		//this키워드: 자기 자신을 의미. 메소드에 속성(필드,데이터)를 사용할때, 
		//this를 붙이면, 코딩때 다른 속성에 데이터를 넣는 오류를 막을 수 있는 좋은 습관이다!
		//이 클래스의 health를 이용하겠단 의미
		System.out.println("다마고치가 밥을 먹고 체력이 "+changeHealth+"올랐습니다.");
		condition();
		
		
	}
	//- 잠: 체력+10, 행복도-20
	public void sleep() {
		changeHealth=ran.nextInt(3)+8;
		this.health+=changeHealth;
		changeAttack=ran.nextInt(3)+18;
		this.attack-=changeAttack;
		System.out.println("다마고치가 잠을 자고 체력이 "+changeHealth+"오르고, 행복도가 "+changeAttack+"떨어졌습니다.");
		condition();
	}
	//- 놀기: 체력-20, 행복도 +30
	public void play() {
		changeHealth=ran.nextInt(3)+18;
		this.health-=changeHealth;
		changeAttack=ran.nextInt(3)+28;
		this.attack+=changeAttack;
		System.out.println("다마고치가 놀고나서 체력이 "+changeHealth+"떨어지고, 행복도가 "+changeAttack+"올랐습니다.");
		condition();
	}
	//- 초기화: 체력, 행복도 데이터 초기화
	public void reset() {
		health=80;
		attack=50;
		//몬스터 층수도 1층으로 초기화, 다시 1~10단계 -> ... -> 40~50단계로 간다!
		System.out.println("게임을 다시 시작합니다."); //or 초기상태로 1층부터 다시 시작합니다.
		condition();
	}
	
	public void decideName() {
		System.out.print("이름을 설정해주세요 >>");
		name = sc.next();
		System.out.println(name+"와 여행을 시작합니다!");// 모험을 시작합니다!
	}
	
	public void changeName() {
		System.out.print("변경할 이름을 적어주세요 >>");
		name = sc.next();
		System.out.println(name+"와 여행을 계속합니다!");// 모험을 시작합니다!
	}
	
	//설정 메뉴 따로 while문 안쪽에 만들어서, 이름 변경하기
	
	
	
//	for(int i=0; i<ar.length; i++) { //랜덤수 없애기
//		ar[i] = ran.nextInt(100)+1;  //
//		for(int j=0; j<i; j++) {	//중복값 없애기 코드					
//			if(ar[i]==ar[j]) {		//이하동문
//				i--;				//
//			}						//
}


