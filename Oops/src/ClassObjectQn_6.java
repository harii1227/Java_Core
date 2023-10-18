
class Q{
	int x=10;
	String y=x+"oyo";
	int m(String a) {
		x++;
		y+=a;
		return x;
	}
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQn_6 {
	public static void main(String[] args) {
		Q q1=new Q();
		Q q2=new Q();
		int b=q1.m("KK");
		q2.m("RRR");
		q1.show();
		q2.show();
		q2.x=b;
		System.out.println(q2.x);
	}
}