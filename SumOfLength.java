class SumOfLength{
	public static void main(String[] args){
		int count=0;
		int[] data1={1,2,3};
		int[] data2={4,5,6,7};
		int[] data3=new int[data1.length+data2.length];		
		for(int i=0;i<data1.length;i++){
			data3[i]=data1[i];
			count++;
		}
		for(int j=0;j<data2.length;j++){
			data3[count++]=data2[j];
		}
		for(int k=0;k<data3.length;k++){
			System.out.print(data3[k]+" ");
		}
	}
}