class Palindrome{  
	public static void main(String[] args) {
	String str="radar";
	String revstring="";
	for(int i=str.length()-1;i>=0;i--){
		revstring +=str.charAt(i);
	}
	System.out.println(str);
	if(revstring.equals(str)){
		System.out.println("The string is Palindrome");
	}
	else{
		System.out.println("Not Palindrome");
	}
	}
}