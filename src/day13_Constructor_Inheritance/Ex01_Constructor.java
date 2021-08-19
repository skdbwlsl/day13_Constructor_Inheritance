package day13_Constructor_Inheritance;

class Constructor01{//클래스 파일만들거면 src쪽에서 클래스파일을 새로 만들어서 한다. 이건 그냥 수업이라 이렇게 쓴것
	public Constructor01(String s){//똑같은 이름으로 만든다. 대신 반환타입은 없어야한다. 이것도 하나의 메소드
		System.out.println(s + "생성자 실행");
	}
	
	public Constructor01(){
		System.out.println("default 생성자 실행");
	}
	
	public void test(String s) {//메소드 반환타입 만들기 
		System.out.println(s+ "test 실행");
	}
	
	public void test() {
		System.out.println("기본 테스트");
	}
	
}
public class Ex01_Constructor {

	public static void main(String[] args) {
		/*
		 생성자 사용
		 - 보통 초기화를 하고자 할 때 사용한다
		 - 클래스 이름과 동일하게 만든다
		 
		 생성자 만드는 방법
		 - 반환타입은 없어야 한다
		 - 객체가 생성될 때 자동으로 호출된다
		 */
		Constructor01 con = new Constructor01("생성자"); //객체 만들기, 생성자는 객체가 생성될 때 자동으로 호출돼기 때문
		//위에서 String s를 적었다면 이곳에서 받아주는 값을 적어줘야 실행이 되기에 String에 해당하는 글인 생성자를 써줬다 
		
		Constructor01 con1 = new Constructor01();
		//default 생성자 실행을 출력할 때 이렇게 아무것도 쓰지 않는다 default니까
		
		con.test("테스트");//메소드는 이렇게해야지만 실행이된다
		//위에서 스트링 s를 했다면 받아주는 값이 있어야 실행이 된다("테스트")
		//이게 메소드 오버로딩
		
		con.test();

	}

}
