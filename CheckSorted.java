class CheckSorted{
	static int[] arr={1,23,37,9};
	static boolean flag=true;
	public static void main(String[] args){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				System.out.println("Not sorted");
			}
			if(flag==false){
				System.out.println("Sorted");
			}
		}
    }
}
