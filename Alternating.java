class Alternating{
	public static void main(String[] args){
		int i=1,j=-1,k=100;
		for(k=0;k<100;k++){
			if(k%2==0){			
			System.out.print(i);
			System.out.print(" ");
			}
			else {
			System.out.print(j);
			System.out.print(" ");
			}
		}
	}
}