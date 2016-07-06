//toString() method
class Complex {
    double re, im;         
 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
}
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        System.out.println(c1);
    }
}