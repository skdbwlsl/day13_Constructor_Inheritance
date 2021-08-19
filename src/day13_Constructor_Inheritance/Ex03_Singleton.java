package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton01 {
	public int num;
}

//singleton : 객체를 하나만 만들어서 쓰겠다는 의미, 하나의 공간을 같이 공유해서 쓴다 사진찍어놓음
public class Ex03_Singleton { 

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //인스턴드 얻어오겠다는 메소드를 만든것, new대신에 이렇게도 쓴다
		
		//이것이 싱글톤패턴
		Singleton01 si = new Singleton01();//new는 새로운 공간을 만든다 //new를 한번만 쓰고  그뒤는 공유해서 쓴다
		Singleton01 si02 = si; //new Singleton01(); //이렇게 공유해서 씀
		
		
		si.num = 12345;
		si02.num = 4444;
		
		System.out.println("si.num : " +si.num);
		System.out.println("si02.num : " +si02.num);
		
		//해당 객체에 대한 주소값
		System.out.println("si : " +si);
		System.out.println("si02 : " +si02);
		

	}

}
