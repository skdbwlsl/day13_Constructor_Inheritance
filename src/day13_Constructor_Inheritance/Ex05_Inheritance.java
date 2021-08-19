package day13_Constructor_Inheritance;



class Calc01{
	public Calc01(String s) {
		System.out.println(s+ ": calc 부모 생성자");
	}
	public void display() {
		System.out.println("부모 나는 계산기");
	}
	
}
class Computer01 extends Calc01{
	public Computer01() {
		super("값 전달"); //super은 부모를 의미, 부모의 매개변수이다.부모쪽으로 넘어가라는 부모 생성자 
		System.out.println("com 자식 생성자"); //상속받으먄 자기자신을 먼저 찾아가지만 출력은 본인이 아닌 부모먼저 출력하고 모두 실행후 자식이 실행된다
	}

	public void print() {
		System.out.println("나는 컴퓨터");
	}
	
}

public class Ex05_Inheritance {

	public static void main(String[] args) {
		/*
		 상속
		 - Extends를 통해 만든다.
		 - 새로운 기능을 추가한다.
		 - 누군가 만든 코드를 끌어와 쓸 수 있다 
		 */
		
		//Calc01 ca = new Calc01();
		//ca.display();
		
		Computer01 com = new Computer01();
		com.print(); com.display(); //display는 new로 새롭게 객체를 만들지 않아도 상속받았기에 바로 호출이된다
		

	}

}
