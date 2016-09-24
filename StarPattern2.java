class StarPattern2{
	public static void main(String[] args){
	int n, i, j, k, l=0, m=5;
    for(i=0;i<5;i++)
    {
        for(j=0;j<l;j++)
        {
            System.out.print(" ");
        }
        for(k=0;k<2*m;k++)
        {
            System.out.print("*");

        }
        l=l+1;
        m=m-1;
        System.out.println("\n");
    }
}
}