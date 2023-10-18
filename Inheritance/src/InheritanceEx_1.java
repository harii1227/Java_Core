
class Mm{
	int x=10;
	static int h=10;
	private int g=30;
	void showG() {
		System.out.println(g);
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class B extends Mm{
	int y=20;
	void m2() {
		System.out.println("Hello B");
		System.out.println(y);
		//System.out.println(g);//error
		showG();
	}
}
public class InheritanceEx_1 {
	public static void main(String[] args) {
		Mm a=new Mm();
		a.x=15;
		a.h=15;
		System.out.println(a.x);
		System.out.println(a.h);
		a.m1();
		B b=new B();
		System.out.println(b.x);
		System.out.println(b.h);
		System.out.println(b.y);
		//System.out.println(b.g);//error
		b.showG();
		b.m1();
		b.m2();
	}
}