
class Demo1
{
	int a,b;
	
	public Demo1()
	{
		System.out.println("parent class constructor");
	}
	public Demo1(int x,int y)
	{
		System.out.println("parameterized parent constructor");
		a=x;
		b=y;
	}
}
class Demo2 extends Demo1
{
	int m,n;
	public Demo2()
	{
		//super();
		//super(10,20);
		this(12,34);
		System.out.println("child class constructor");
	}
	public Demo2(int x,int y)
	{
		System.out.println("parameterized child class constructor");
	}
}
public class InheritanceExConstructerEx_6 {
	public static void main(String[] args) {
		Demo2 d=new Demo2();//---------
		//Demo2 d2=new Demo2(10,20);//---------
		
		
	}
}