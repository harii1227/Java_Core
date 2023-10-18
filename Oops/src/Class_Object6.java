
class Students{
	String name;
	int age;
	String FatherName;
	int Fee;
	String SchoolName;
	void show() {
		System.out.println(name+" "+age+" "+FatherName+" "+Fee+" "+SchoolName);
	}
	void input(String n,int ag,String FN,int Fe,String Sn)
	{
		name=n;
		age=ag;
		FatherName=FN;
		Fee=Fe;
		SchoolName=Sn;
	}
	
}
	
public class Class_Object6 {
	public static void main(String[] args) {
		Students a=new Students();
		Students b=new Students();
		Students c=new Students();
		Students d=new Students();
		Students e=new Students();
		
//		a.show();
//		b.show();
//		c.show();
//		d.show();
//		e.show();
		
		a.input("ram", 12, "ramu", 3454, "jnv1");
		b.input("ramu", 12, "rami", 3454, "jnv1");
		c.input("ramji", 12, "raml", 3454, "jnv1");
		d.input("ramn", 12, "ramji", 3454, "jnv1");
		e.input("raman", 12, "ramus", 3454, "jnv1");
		

		
		a.show();
		b.show();
		c.show();
		d.show();
		e.show();
		
				
			}
}
