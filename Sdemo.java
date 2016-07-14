//Program to accessing static and non-static properties.
class A
{
int y;
void f2()
{
System.out.println("Hello f2()");
}
}
class B
{
int z;
void f3()
{
System.out.println("Hello f3()");
A a1=new A();
a1.f2();
}
}
class Sdemo
{
static int x;
static void f1()
{
System.out.println("Hello f1()");
}
public static void main(String[] args)
{
x=10;
System.out.println("x="+x);
f1();
System.out.println("Hello main");
B b1=new B();
b1.f3();
}
}