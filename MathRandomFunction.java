class MathRandomFunction{
	public static void main(String[] args){
		int greaterThanHalf=0,lessThanHalf=0;
		for(int i=0;i<1000;i++){
			double x = Math.random();
			if(x>0.5) greaterThanHalf++;
			else lessThanHalf++;
			}
			System.out.println(greaterThanHalf);
	}
}