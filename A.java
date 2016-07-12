//
public class A1
{
public void fun1()
{
.......
}
public final void fun2()
{
.......
}

}
class B extends A1
{
public void fun1()
{
.......
}
public void fun2()
{
 // it gives an error because we can not override final method
}
}