public class Sample{
 
        public static void main(String[] args) {
               
                int a = 5;
		System.out.println("a: " + a);
		a=70;
		System.out.println("a: " + a);
                Example e1=new Example();
		System.out.println("e1: " + e1);
		e1=new Example();
                System.out.println("e1: " + e1);
		e1=new Example();
		System.out.println("e1: " + e1);
		Example e2=e1;
		System.out.println("e2: " + e2);
		Object e5="a";
		System.out.println("e5: " + e5);
        }
}