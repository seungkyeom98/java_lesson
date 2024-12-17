package 추상화;

//추상클래스인 Student를 상속받는 Miri 클래스
public class Miri extends Student{

	String name;
	String position;
	
	//생성자
	
	public Miri(String n, String p) {
		this.name =n;
		this.position = p;
	}
	
	@Override//부모 클래스 재정의= 오버라이딩= 부모 메소드에 올라탄다!
	public void study() {
		// 상속받은 Student(추상클래스)의 추상메소드인 study는
		// 반드시 자식클래스에서 오버라이딩(재정의) 해줘야 한다!
		 System.out.println(this.position + "프론트엔드로 향하는 여정...");
	}

}
