class Die{
	int sideUp;
	int roll(){
		int sideUp = (int)(6*Math.random()+1);
		return sideUp;
	}
}
class DieDemo{
	public static void main(String[] args){
		int player11,player12;
		Die Die1=new Die();
		Die Die2=new Die();
		player11=Die1.roll();
		player12=Die2.roll();
		System.out.println(player11+player12);
	}
}