class Gravity{
	static double WeightM(double Mgravity){
			double a,m=60;
			a=60*(Mgravity);
			return a;
		}
	public static void main(String[] args){
		double Mgravity,Egravity=9.8;
		Mgravity = 0.17*(Egravity);
		double b=WeightM(Mgravity);
		System.out.println("your weight on the moon is:"+b);
	}
}