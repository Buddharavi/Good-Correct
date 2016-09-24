class FindFac{
	public static void main(String[] args){
		int i=100,j=1,count=1;
		System.out.println("the factors are: ");
		for(;;){
			if(i%j==0) {
				System.out.println(j);
				j++; 
				count++;
			}
			else j++;
			if(count==10) 
				break;
		}	
	}
}