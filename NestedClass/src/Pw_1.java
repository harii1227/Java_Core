

// inner class types--member inner class
// --static member class
//---anonymous inner class
class A
{
	public void show()
	{
		System.out.println("in show");
	}
	class B//--member inner class
	{
		public void display()
		{
			System.out.println("in display");
		}
		
	}
}



public class Pw_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =new A();
		A.B obj1=obj.new B();
		obj.show();
		obj1.display();
	}

}
