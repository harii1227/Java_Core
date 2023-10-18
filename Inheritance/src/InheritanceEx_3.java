
class human1
{
	private String name;
	int age;
	
	human1()
	{
		System.out.println("human class constructor");
	}
	
	void sleep()
	{
		age=18;
		System.out.println("human need a good sleep");
		System.out.println(age);
	}
}

class student1 extends human1
{
	void disp()
	{
		System.out.println("the age is : " + age);
		//System.out.println("the name is : " + name);    private member can't be inherit
	}
}

public class InheritanceEx_3{
	public static void main(String[] args)
	{
		student1 st1=new student1();
		st1.sleep();
		st1.disp();
		
		
	}
}