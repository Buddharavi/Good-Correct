class CountSpaces{
	public static void main(String[] args){
		char ch;
		int howManySpaceCharactersEntered=0;
		System.out.println("print a period to stop");
		do{
			ch = (char)Integer.parseInt(args[0]);
			if(ch==' ') howManySpaceCharactersEntered++;
			}while(ch!='.');
			System.out.println(howManySpaceCharactersEntered);
	}
}