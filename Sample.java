class Example{
	int x=10;
	int y=20;
	void m1(){
		System.out.println("m1");
	}
}	
class Sample extends Example{
		int x=30;
		int y=40;
	void m2(){
		System.out.println("x: "+x);
		System.out.println("y: "+y);
			
		System.out.println("x: "+super.x);
		System.out.println("x: "+super.y);		
	}
	void m3(){
		int x=50,y=60;
		System.out.println("local x: "+x);
		System.out.println("local y: "+y);
			
		System.out.println("subclass x: "+this.x);
		System.out.println("subclass y: "+this.y);
			
		
		System.out.println("subclass x: "+super.x);
		System.out.println("subclass y: "+super.y);	
	}
	public static void main(String[] args){
		Sample s=new Sample();
		s.m2();
		s.m3();
	}
}
	