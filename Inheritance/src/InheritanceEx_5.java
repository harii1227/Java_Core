
class z
{
	int i;
	z(){
		System.out.println("Hi A");
	}
	z(int x)
	{
		i=x;
		System.out.println("Hello A");
	}
}
class x extends z
{
	int j;
	x()
	{
		super(4);
		System.out.println("Hi B");
	}
	x(int y)
	{
		j=y;
		System.out.println("Hello B");
	}
	void show()
	{
		System.out.println(i+" "+j);
		
	}
	
}
public class InheritanceEx_5
{
	public static void main(String[] args)
	{
		x b1=new x();
		x b2=new x();
		b1.show();
		b2.show();
	}
}