
class AA{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
}
public class Class_Object4 {
	public static void main(String[] args) {
		AA a=new AA();
		a.x=10;
		AA b=new AA();
		b.y="Ram";
		a.show();
		b.show();
	}
}
