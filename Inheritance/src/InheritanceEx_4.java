
class Human2
{
	String name;
	int age;
	void show()
	{
		System.out.println(name+" "+age);
	}
	static {
		System.out.println("Hi human");
	}
}
class Student2 extends Human
{
	String SchoolName;
	void print()
	{
		show();
			System.out.println(SchoolName);
	}
		static {
			System.out.println("Hi Student");
		}
	}
public class InheritanceEx_4{
	public static void main(String[] args)
	{
		Student2 b=new Student2();
		b.name="Ram";
		b.age=10;
		b.SchoolName="JNV";
		b.print();
		
	}
}