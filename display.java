class display{
	static void displayAbsX(int x){
	if(x>0){
		System.out.println(x);
		return ;
	}
	else{
		System.out.println(-x);
		return;
	}
	}
	public static void main(String[] args){
	displayAbsX(10);
	System.out.println("Done");
	}
}