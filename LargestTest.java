class Largest{
	int max(int a,int b){
		if(a>b) return a;
		else return b;
	}
}
class LargestTest{
	public static void main(String[] args){
		int c;
		Largest choose=new Largest();
		c=choose.max(2,3);
		System.out.println("Largest number between 2 and 3 is: "+c);
	}
}