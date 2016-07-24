class A{}
class B extends A{}
class C extends B{}
class D{}
class ReferenceTypeConversion{
	public static void main(String[] args){
	A  a = new B();
	System.out.println(a instanceof Object);
	System.out.println(a instanceof A);
	System.out.println(a instanceof B);
	System.out.println(a instanceof C);
	//System.out.println(a instanceof D);
	Object obj = new B();
	System.out.println(a instanceof Object);
	System.out.println(a instanceof A);
	System.out.println(a instanceof B);
	System.out.println(a instanceof C);
	//System.out.println(a instanceof D);	
}
}