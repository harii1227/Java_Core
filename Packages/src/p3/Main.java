package p3;

public class Main {

	public static void main(String[] args) {
		//p1.C c=new p1.C();//error
		p1.A a=new p1.A();
		System.out.println(a.x);
		//System.out.println(a.j);//error
		a.m1();
		p1.B b=new p1.B();
		System.out.println(b.y);
		b.m2();
		P2.A aa=new P2.A();
		System.out.println(aa.h);
		aa.m();
		P2.D d=new P2.D();
		System.out.println(d.z);
		d.m3();
	}

}