class Largest1{
	void max(int a,int b,int c){
		if( a > b && a > c )
			System.out.println("First number is largest." +a);
		else if( b > a && b > c )
			System.out.println("Second number is largest." +b);
		else if( c > a && c > b )
			System.out.println("Third number is largest." +c);
	}
}
class LargestTest1{
	public static void main(String[] args){
		Largest1 choose=new Largest1();
		choose.max(2,3,4);
		}
}