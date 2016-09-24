class Average{
	double []a = {11.2,32.5,34,64,13,97,354,2,6,7};
	public static void main(String[] args){
	//double []a = {11.2,32.5,34,64,13,97,354,2,6,7};
	double sum=0,avg=0;
	int i;
	for(i=0;i<10;i++){
		sum=sum+a[i];
	}
	avg=sum/i;
	System.out.println("Average of entered elements are: " +avg);
	}
}