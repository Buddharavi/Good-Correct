class squareDemo//square of number given from command line aurgument
{
int no, result;
void square(String s)
{
int no=Integer.parseInt(s);
result=no*no;
System.out.println("Square: " +result);
}
}
class CMD
{
public static void main(String args[])
{
System.out.println("no of arguments: "+args.length);
squareDemo  obj=new  squareDemo();
obj.square(args[0]);
}
}