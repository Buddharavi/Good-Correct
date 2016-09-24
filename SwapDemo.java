class Swapper{
int x,y;
//static int a,b;
	
	Swapper(int a, int b){ // need to declare the data type.
		x=a;
		y=b;
	}
	void swap(int a,int b){
		int t;
		t=x;
		x=y;
		y=x;
		
	}
	int getX(){
	return x;
	}
	int getY(){
	return y;
	}
}	
class SwapperDemo{
	public static void main(String[] args){
		int a,b;
		Swapper obj=new Swapper();
		obj.swap(10,20);
		a=getX();	
		b=getY();
		System.out.println("The numbers after swapping are " + a + b);
	}
}
