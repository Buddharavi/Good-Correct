//Access Static and Non Static
class A
{
void fun1()
{
System.out.println("Hello I am Non-Static");
}
static void fun2()
{
System.out.println("Hello I am Static");
}
}
class Person
{
public static void main(String args[])
{
A  oa=new  A();
   oa.fun1(); // non static method 
   A.fun2();  // static method
}
}