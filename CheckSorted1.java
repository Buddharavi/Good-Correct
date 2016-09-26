class CheckSorted1{
static boolean isSorted(int[] a){	
	int i;
	int b=a.length;
	int count=0;
    for(i=0;i<a.length-1;i++){
        if(a[i]<a[i+1]) count++;		
	}
	if(count==b-1) return true;
	else return false;
	}
public static void main(String[] args){
          int ar[] = {2,3,6,7,8,9,23,234,3463};
          System.out.println(isSorted(ar)); 
}
}

