
class Demo
{
	static int x;
	int y;
	Demo(){
		System.out.println("hello");
		x=20;
		y=10;
	}
	static {
		System.out.println("hi");
	}
}



public class Assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Demo d2=new Demo();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d2.x);
		System.out.println(d2.y);

	}

}
