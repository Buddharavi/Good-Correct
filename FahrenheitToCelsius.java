class FahrenheitToCelsius{
	public static void main(String[] args){
		double fahrenheit,celsius;
		boolean x=true;
		fahrenheit=62;
		celsius=(fahrenheit-32)*5.0/9.0;
		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
		x|=false;
		x&=true;
		x^=true;
		System.out.println(x);
	}
}