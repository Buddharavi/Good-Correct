class Student
{
int roll_no;
float marks;
String name;
static String College_Name="ITM";
}
class StaticDemo
{
public static void main(String args[])
{
Student s1=new Student();
s1.roll_no=100;
s1.marks=65.8f;
s1.name="abcd";
System.out.println(s1.roll_no);
System.out.println(s1.marks);
System.out.println(s1.name);
System.out.println(Student.College_Name); 
//or System.out.println(s1. College_Name); but first is use in real time.
Student  s2=new  Student();
s2.roll_no=200;
s2.marks=75.8f;
s2.name="zyx";
System.out.println(s2.roll_no);
System.out.println(s2.marks);
System.out.println(s2.name);
System.out.println(Student.College_Name); 
}
}