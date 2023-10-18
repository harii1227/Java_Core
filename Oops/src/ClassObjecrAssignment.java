
class Assign{
int x=10;
String y="Rahul";
void show() {
System.out.println(x+y);
}
}
class Test {
public static void main(String[] args) {
Assign a= new Assign();
Assign b= new Assign();
a.x=15;
a.show();
a.y="YoYo";
b.show();
b.y="Ramu";
a.show();
b.show();
}
}
////2. What is the Output:
//class Animal{
//String name;
//private int age;
//String color;
//void input() {
//name="xyz";
//age=15;
//}
//void show() {
//System.out.println(name+age+color);
//}
//}
//class Test {
//public static void main(String[] args) {
//Animal a= new Animal();
//a.show();
//a.input();
//Animal b= new Animal();
//a.show();
//b.show();
//}
//}