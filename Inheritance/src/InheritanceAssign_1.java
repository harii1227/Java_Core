
class A{
int x;
A() {
System.out.println("Hi A");
x=10;
}
}
class w extends A{
int y;
w() {
System.out.println("Hello B");
x=15;
}
void show(){
System.out.println(x);
System.out.println(y);
}
}
class InheritanceAssign_1{
public static void main(String[] args) {
w b= new w();
b.show();
}
}