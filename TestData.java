class TestData{
	static int[] arr= {3,4,1,5,6,9,4};
	public static void main(String[] args){
		
			System.out.print("\"");
			System.out.print("{");
			for(int arr1=0;arr1<arr.length;arr1++){
				System.out.print(arr[arr1]);
				if(arr1<(arr.length-1)){
					System.out.print(",");
				}
			}
			System.out.print("}");
			System.out.print("\"");
			
		
	}
}	