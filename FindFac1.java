class FindFac1{
	public static void main(String[] args){
		int j=1,count=1;
		System.out.println("the factors are: ");
		for(int i=1;;i++){
			if(i%j==0) {
				//System.out.println(j);
				j++; 
				count++;
			}
			else j++;
			if(count==10){ 
				System.out.println(j);
				break;
			}
		}	
	}
}
