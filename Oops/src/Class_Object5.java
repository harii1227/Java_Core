
class Student{
	String name;
	int age;
	String FatherName;
	int Fee;
	String SchoolName;
	
}
	
public class Class_Object5 {
	public static void main(String[] args) {
		Student a=new Student();
		Student b=new Student();
		Student c=new Student();
		Student d=new Student();
		Student e=new Student();
		
		System.out.println(a.name+" "+a.age+" "+a.FatherName+" "+a.SchoolName+" "+a.Fee);
		System.out.println(b.name+" "+b.age+" "+b.FatherName+" "+b.SchoolName+" "+b.Fee);
		System.out.println(c.name+" "+c.age+" "+c.FatherName+" "+c.SchoolName+" "+c.Fee);
		System.out.println(d.name+" "+d.age+" "+d.FatherName+" "+d.SchoolName+" "+d.Fee);
		System.out.println(e.name+" "+e.age+" "+e.FatherName+" "+e.SchoolName+" "+e.Fee);
		

		a.name="Yoyo Gupta";
		a.age=34;
		a.SchoolName="JNV1";
		a.Fee=78000;
		a.FatherName="ABC";
		
		b.name="raman";
		b.age=33;
		b.SchoolName="JNV3";
		b.Fee=7800;
		b.FatherName="BC";
		
		c.name="Gupta";
		c.age=44;
		c.SchoolName="JNV2";
		c.Fee=79000;
		c.FatherName="AC";
		
		d.name="don";
		d.age=90;
		d.SchoolName="JNV9";
		d.Fee=98000;
		d.FatherName="ABCg";
		
		e.name="gogo";
		e.age=54;
		e.SchoolName="JNV6";
		e.Fee=78078;
		e.FatherName="ABCr";
		
		System.out.println(a.name+" "+a.age+" "+a.FatherName+" "+a.SchoolName+" "+a.Fee);
		System.out.println(b.name+" "+b.age+" "+b.FatherName+" "+b.SchoolName+" "+b.Fee);
		System.out.println(c.name+" "+c.age+" "+c.FatherName+" "+c.SchoolName+" "+c.Fee);
		System.out.println(d.name+" "+d.age+" "+d.FatherName+" "+d.SchoolName+" "+d.Fee);
		System.out.println(e.name+" "+e.age+" "+e.FatherName+" "+e.SchoolName+" "+e.Fee);
				
			}
}
