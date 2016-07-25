class Example{
   
   void m1(){
      System.out.println("m1");
   }
}
class Sample extends Example{
	void m2(){
      System.out.println("m2 bye");
}
}
class Test{
	static void m3(Object obj){
if(obj instanceof Example)
{
Example e=(Example)obj;
e.m1();
}
else if(obj instanceof Sample)
{
Sample s=(Sample)obj;
s.m1();
s.m2();
}
}
   public static void main(String args[]){
	Test.m3(new Example());
	Test.m3(new Sample());
	Test.m3(new Object());	
	/*System.out.println(e instanceof Sample);
	System.out.println(s instanceof Sample);
	System.out.println(e instanceof Example);
	System.out.println(s instanceof Example);*/
}
}