package day13_Constructor_Inheritance;
//다중 상속은 안되기 때문에 하나씩 상속받아야한다. ex) extends calc06, AAA이런 식으론 안됌

class AAA{
	public void aaa() {System.out.println("test");}
}
class Calc06{
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수 "; //외부 접근은 막고 자식 패키지는 상속하고 다른 패키지 상속은 막겠다 거의 쓸일 없다
	public Calc06(String s) {
		System.out.println(s+ " 부모 생성자");
	}
	
	
		
		public void test() {
			System.out.println("부모 test 실행");
		}
	}
	class Computer06 extends Calc06{
		public int n =7777;
		public Computer06(String ss) {
			super(ss); 
			System.out.println(ss + ": 자식 생성자"); 
			test(); //부모에게 있는 test를 호출해라
			System.out.println("this.n: "+n); //기본적으로 자기자신7777을 출력하지만 super을 붙이면 부모 실행
			System.out.println("super.n: " +super.n);
			System.out.println("super.s: " +s);
			//System.out.println("super private ss : " + super.ss) ;
			System.out.println("super protected sss : " +super.sss);
		}
		public void test() {
			System.out.println("자식 test 실행");
		}
}



public class Ex06_Inheritance {

	public static void main(String[] args) {
		Computer06 com = new Computer06("전달");

	}

}
