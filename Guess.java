class Guess{
	public static void main(String[] args)throws java.io.IOException{
		char ch,answer='k';
		System.out.println("enter a letter between A and Z");
		System.out.println("can u guess it: ");
		ch=(char)System.in.read();
		if(ch==answer||ch==answer+1) System.out.println("***correct***");	
		else System.out.println("***Wrong***");
	}
}