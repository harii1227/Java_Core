
class Human
{
	String name;
	int age;
	void show()
	{
		System.out.println(name+" "+age);
		
	}
}
class Student extends Human
{
	String schoolName;
	void print()
	{
		show();
		System.out.println(schoolName);
	}
}
public class InheritanceEx_2{
	public static void main(String[] args)
	{
		Human a=new Human();
		a.name="raman";
		a.age=21;
		Student b=new Student();
		b.name="mukhila";
		b.age=17;
		b.schoolName="jnv";
		b.print();
		a.show();
		
		
	}
}