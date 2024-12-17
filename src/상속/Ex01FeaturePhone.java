package 상속;

//상속 받는 방법
//-> 클래스 이름 뒤에 'extends(=확장) 슈퍼클래스이름' 적으면 된다!
public class Ex01FeaturePhone extends Ex01Phone{

	//Phone의 데이터/로직을 그대로 물려받고,
	//사진찍기(photo)로직을 추가해보자!
	public void photo() {
		System.out.println("사진 찍기! 찰칵찰칵!");
	}
	
	
	
	
	
	
	
	
	
}
