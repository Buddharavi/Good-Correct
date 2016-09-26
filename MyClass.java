class MyClass{
	static int[] data={1,8,3,5,4,6,10,9,2,7};
	static int i,count=0;
	static int indexOf(int x){
		for(i=0;i<data.length;i++){
			if(data[i]==x) 
				return i;
				count++;	
		}	
		if(count!=1) return -1; 
		return 0;
	}
	public static void main(String[] args){
		int a;
		a=indexOf(11);
		System.out.println(a);
	}
}