package day13_Constructor_Inheritance;
//���� ����� �ȵǱ� ������ �ϳ��� ��ӹ޾ƾ��Ѵ�. ex) extends calc06, AAA�̷� ������ �ȉ�

class AAA{
	public void aaa() {System.out.println("test");}
}
class Calc06{
	public int n = 12345;
	public String s = "�θ� ���ڿ�";
	private String ss = "private ����";
	protected String sss = "protected ���� "; //�ܺ� ������ ���� �ڽ� ��Ű���� ����ϰ� �ٸ� ��Ű�� ����� ���ڴ� ���� ���� ����
	public Calc06(String s) {
		System.out.println(s+ " �θ� ������");
	}
	
	
		
		public void test() {
			System.out.println("�θ� test ����");
		}
	}
	class Computer06 extends Calc06{
		public int n =7777;
		public Computer06(String ss) {
			super(ss); 
			System.out.println(ss + ": �ڽ� ������"); 
			test(); //�θ𿡰� �ִ� test�� ȣ���ض�
			System.out.println("this.n: "+n); //�⺻������ �ڱ��ڽ�7777�� ��������� super�� ���̸� �θ� ����
			System.out.println("super.n: " +super.n);
			System.out.println("super.s: " +s);
			//System.out.println("super private ss : " + super.ss) ;
			System.out.println("super protected sss : " +super.sss);
		}
		public void test() {
			System.out.println("�ڽ� test ����");
		}
}



public class Ex06_Inheritance {

	public static void main(String[] args) {
		Computer06 com = new Computer06("����");

	}

}
