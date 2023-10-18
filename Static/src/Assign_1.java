
class Assign {
	static int x;
	void m() {
		x++;
		System.out.println(x);
		
	}
	static void setX(int a)
	{
		x=a;
		
	}
}
class Assign_1
{
	public static void main(String[] args)
	{
		Assign a=new Assign();
		System.out.println(a.x);
		a.m();
		Assign.setX(15);
		a.m();
	}
}