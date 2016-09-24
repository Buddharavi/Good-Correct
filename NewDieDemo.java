class NewDie{
	int sideUp;
	NewDie(){
		sideUp=0;
	}
	void roll(){
		sideUp = (int)(6*Math.random()+1);
	}
	int getSideUp(){
		return sideUp;
	}
}
class NewDieDemo{
	public static void main(String[] args){
		int player11,player12;
		NewDie Die1=new NewDie();
		NewDie Die2=new NewDie();
		Die1.roll();
		player11=Die1.getSideUp();
		Die2.roll();
		player12=Die2.getSideUp();
		System.out.println(player11+player12);
	}
}