class Example{
   
   void m1(){
      System.out.println("m1");
   }
	/*void m2(){
      System.out.println("m1 hi");
}*/

}
class Sample extends Example{
   
   /*void m1(){
      System.out.println("m2");
}*/
	void m2(){
      System.out.println("m2 bye");
}
}
class Test{
   public static void main(String args[]){
	Example e=new Sample();
	e.m1();
	Sample s=(Sample)e;
	s.m2();
}
}