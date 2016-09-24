class abc{
	public static void main(String[] args){
		int a,j=0;
		double k=0;
		for(int i=1;i<21;i++){
			System.out.println(i*i);
		}
		for(int i=1;i<21;i++){
			j = i*i + j;
			k=j/20;
		}
		System.out.println("Sum of the first 20 squares is: "+j);
		System.out.println("average of the first 20 squares is: "+k);
	}
}