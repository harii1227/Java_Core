
class Animals
{
	void eat()
	{
		System.out.println("eat veg");
	}
}
class Dog extends Animals
{
	
	void eat()
	{
		System.out.println("eat both");
	}
}
class Elephant extends Animals
{
	void eat()
	{
		System.out.println("eat ninveg");
	}
	
}
public class RunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a=new Animals();
		a.eat();
		a=new Dog();
		a.eat();
		a=new Elephant();
		a.eat();
		
	}

}
