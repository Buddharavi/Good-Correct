class A2	//Outer class
{
class B	// non-static  inner class
{
int x;	//inner class variable
void fun1()	//inner class fun1()
{
System.out.println("Hello fun1()");
}
}
static class C	//static inner class
{
int  y=20;  // inner class variable
void fun2()
{
System.out.println("Hello fun2()");
}
}
}

class IncDemo
{
public static void main(String args[])
{
A2.B  ob=new  A2().new B();
System.out.println(ob.x);
ob.fun1();
A2.C  oc=new  A2.C();
System.out.println(oc.y);
oc.fun2();
}
}