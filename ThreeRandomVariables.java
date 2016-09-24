class ThreeRandomVariables{
	public static void main(String[] args){
	double a=Math.random();
	double b=Math.random();
	double c=Math.random();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	if(a<=0.2 && b<=0.2 && c<=0.2) System.out.println("All are tiny");
	if(a<=0.2 && b>=0.2 && c>=0.2) System.out.println("Exactly one is tiny");
	else if(a>=0.2 && b<=0.2 && c>=0.2) System.out.println("Exactly one is tiny");
	else if(a>=0.2 && b>=0.2 && c<=0.2) System.out.println("Exactly one is tiny");
	}
}