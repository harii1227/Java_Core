
class AA{
	int x=10;
	static{
		System.out.println("Hi A");
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class BB extends AA{
	int y=20;
	static{
		System.out.println("Hi B");
	}
	void m2() {
		System.out.println("Hello B");
	}
}
public class InheritanceStaticBlockEx_1 {
	public static void main(String[] args) {
		AA a=new AA();
		BB b1=new BB();
		BB b2=new BB();
	}
}