class Series{
	int [] a=new int[30];
	void seriesInput(int x,int y){
		a[0]=x;
		a[1]=y;
		System.out.print(x);
		System.out.print(y + " ");
		for(int i=2;i<a.length;i++){
			if(a[i-1]<0) a[i]=-a[i-1]+1;
			else a[i]=-(a[i-1]+1);
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}	
	void seriesInput1(int x,int y){
		System.out.println("");
		for(int i=0;i<15;i++){
			a[i]=x+i;
			a[i+1]=y+i;
			System.out.print(a[i]);
			System.out.print(" ");
			System.out.print(a[i+1]);	
			System.out.print(" ");
		}
    }	
	void seriesInput2(int x,int y){
		a[0]=x;
		System.out.println();
		System.out.print(x);
		System.out.print(" ");
		for(int i=0;i<29;i++){
			a[i+1]=2*a[i];
			System.out.print(a[i+1]);
			System.out.print(" ");
		}
	}
	void seriesInput3(int x,int y){
		a[0]=x;
		a[1]=y;
		System.out.println();
		System.out.print(x);
		System.out.print(" ");
		System.out.print(y);
		System.out.print(" ");
		for(int i=0;i<27;i++){
			a[i+2]=a[i+1]+a[i];
			System.out.print(a[i+2]);
			System.out.print(" ");
		}
	}
}
class SeriesTest{
	public static void main(String[] args){
		Series series1=new Series();
		Series series2=new Series();
		Series series3=new Series();
		Series series4=new Series();
		series1.seriesInput(1,-2);
		series2.seriesInput1(1,1);
		series3.seriesInput2(1,2);
		series4.seriesInput3(1,1);
	}
}