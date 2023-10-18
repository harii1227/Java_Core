class Master
{
	public void disp(Shape ref)
	{
		ref.findArea();
		ref.printArea();
		
		System.out.println("--------------------");
	}
}
public class ShapeApp {

	public static void main(String[] args) {
//		Shape s1=new Circle();
//		s1.findArea();
//		s1.printArea();
//		Shape s2=new Rectangle();
//		s2.findArea();
//		s2.printArea();
//		Shape s3=new Triangle();
//		s2.findArea();
//		s2.printArea();
		
		
		Shape s1=new Circle();
		Shape s2=new Rectangle();
		Shape s3=new Triangle();
		
		Master m=new Master();
		m.disp(s1);
		m.disp(s2);
		m.disp(s3);


	}

}
