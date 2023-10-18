
class Xxxx
{
	int a=10;
	void m1(){
		System.out.println("hello x");
	}
	static void m2()
	{
		System.out.println("hi x");
	}
}
class Yyyy extends Xxxx
{
		int a=40;
		int b=20;
		void m1()
		{
			System.out.println("hello y");
		}
		static void m2()
		{
			System.out.println("hi y");
		}
		void m3()
		{
			System.out.println("incapp");
		}
}
public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xxxx x=new Yyyy();
		System.out.println((x.a));
		x.m1();
		x.m2();
		//x.m3();
	}

}
