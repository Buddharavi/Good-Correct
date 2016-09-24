class KybIn{
		public static void main(String[] args)throws java.io.IOException{
			int ch;
			System.out.println("enter a key followed by enter");
			ch = System.in.read();
			System.out.println("your entered character is:" +ch);
		}
}