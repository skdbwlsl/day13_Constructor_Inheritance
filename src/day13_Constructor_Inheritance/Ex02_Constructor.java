package day13_Constructor_Inheritance;

import java.util.Scanner;

class Constructor02{
	private int age;
	public Constructor02(int age){//초기화하고자 할 때 생성자를 사용하기도 한다
		this.age  = age-1;
	}
	public int getAge() {
		return age;
	}
}

public class Ex02_Constructor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나이 입력");
		int age = input.nextInt();
		Constructor02 con = new Constructor02(age);//입력받은 값 생성자한테 넘겨주기
		System.out.println("나이 : " +con.getAge());//따로 세터를 호출할 필요가 없어진다

	}

}

