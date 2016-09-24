class DivideBy2{
	public static void main(String[] args){
		double j=1,count=0;
		while(j>=0.0001){
			j=j/2;
			count++;
		}
		System.out.println("iterations required to get value 0.0001 when dividing 1 by 2 again and again is: " +count);
	}
}-