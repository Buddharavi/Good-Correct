class PowerFunction{ 
	public static void main(String args[]) {
      double x = 3,y,ThreePowers=0;
	  System.out.println("powers of 3 from 3^0 to 3^9 are: ");
	  for(y=0;y<=9;y++){
		  ThreePowers=Math.pow(x,y);
		  System.out.println(ThreePowers);
      }
	}
}	