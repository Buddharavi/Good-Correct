class StarPattern1{
	public static void main(String[] args){
		int i,j,k;
        for(i=4;i>=0;i--){
            for(j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(k=i-4;k<1;k++){
                System.out.print("*");
			}
            System.out.println();
        }
	}
}