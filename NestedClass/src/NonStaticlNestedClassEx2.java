
class Aa{ //Outer/Upper class
	int x=10;
	static int g=80;
	private int z=70;
	void m() {
		System.out.println("Hello A");
		System.out.println(x);
		System.out.println(g);
		System.out.println(z);
		//System.out.println(y);//error
		//System.out.println(h);//error
		System.out.println(B.h);
		B b=new B();
		b.m2();
		System.out.println(b.y);
		
	}
	class B{ //Non-Static Nested/Inner Class
		int y=20;
		static int h=90;
		void m2() {
			System.out.println("Hello B");
			System.out.println(y);
			System.out.println(h);
			System.out.println(x);
			System.out.println(g);
			System.out.println(z);
		}
	}
}
public class NonStaticlNestedClassEx2 {

	public static void main(String[] args) {
		//B b=new B(); //error
		System.out.println(Aa.B.h);
		System.out.println(Aa.g);
		Aa a=new Aa();
		System.out.println(a.x);
		a.m();
		Aa.B b=a.new B();
		System.out.println(b.y);
		b.m2();
		//System.out.println(b.x);//error
		//System.out.println(a.y);//error
	}
}