class Swapper{
	int x,y;
	Swapper(int x,int y){
		this.x=x;
		this.y=y;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	void swap(){
		int t;
		t=x;
		x=y;
		y=t;		
	}
} 
class SwapPerDemo{
	public static void main(String[] args){
		int a,b;
		Swapper first=new Swapper(1,2);
		first.swap();
		a=first.getX();
		b=first.getY();
		System.out.println("Numbers after swapping are: "+a +b);
	}
}