package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton04{
	private static Singleton04 si;//new를 안만나서 객체가 생성되지 않은 상태
	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}
	
	public static Singleton04 getInstance() {
		System.out.println("si :" +si ); //처음엔 new가 없기에 null값이 출력됌
		if(si==null)//null값이라면 객체를 만들어라!
			si = new Singleton04(); //내부에서 접근해서 실행해 객체를 만들겠다 위의 private때문에 이렇게 해주는것
		return si;
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		//Calendar cal = Calendar.getInstance();
		Singleton04 si01 = Singleton04.getInstance(); //new를 쓰지않고 객체를 가지고 오겠다
		System.out.println("si01 : " +si01);
	
		
		Singleton04 si02 = Singleton04.getInstance(); 
		System.out.println("si02 : " +si02);
	}

}
//결국 객체를 하나만 만들어서 사용한다는 의미가 싱글톤패턴
