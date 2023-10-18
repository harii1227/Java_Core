

public class ClassObjectQn_2 {
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ClassObjectQn_2 a=new ClassObjectQn_2();
		a.x=10;
		a.y="KK";
		ClassObjectQn_2 b=new ClassObjectQn_2();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();
	}
}