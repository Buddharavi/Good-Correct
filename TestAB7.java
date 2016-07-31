class A7{
	int x=10;
	int y=20;
}
class B7 extends A7{
	int x=30;
	int y=40;
}
class TestAB7{
	public static void main(String[] args){
		B7 b=new B7();
		A7 a=new B7();
		
		System.out.println(b.x+"..."+b.y);
		System.out.println(a.x+"..."+a.y);
		
		b.x=5;
		a.x=6;
		
		System.out.println(b.x+"..."+b.y);
		System.out.println(a.x+"..."+a.y);
	}
}