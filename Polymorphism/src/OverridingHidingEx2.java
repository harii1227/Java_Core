
class animal
{
	public void eat()
	{
		System.out.println("animal can eat");
	}
	public void age(int x)
	{
		System.out.println("animal age is");
	}
}

class tiger extends animal
{
	//---void  eat()---  we can not decrrease the visibility of acccess modifiers
	//that's why we will use public in this class also
	public void  eat()
	{
		System.out.println("tiger can hunt");
	}
//	public int age() it gives error because we can not change the return type in child class
//	{
//		return 0;
//	}
	public void age(int x)//--overide---
{
	System.out.println("old age");
}
}
public class OverridingHidingEx2 {
	public static void main(String[] args) {
		tiger t=new tiger();
		t.eat();
		t.age(0);
	}
}