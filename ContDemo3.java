class ContDemo3{
	public static void main(String[] args){
		int i=0;
		for(;;){
			if(i%2==0) System.out.println(i);
			i++;
			if(i==100) break;
		}
	}
}