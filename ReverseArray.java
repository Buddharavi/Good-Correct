class ReverseArray{
	static void reverseArray(int arr[],int start,int end){
		int a;
        if(start>=end) 
			return;
        a=arr[start];
        arr[start]=arr[end];
        arr[end]=a;
        reverseArray(arr,start+1,end-1);
    }
    static void printArray(int arr[],int size){
        int i;
        for(i=0;i<size;i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printArray(arr,6);
        reverseArray(arr,0,5);
        printArray(arr, 6);
    }
}