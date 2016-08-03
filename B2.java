/**
 * Created by DhanaSM on 03-08-2016.
 */
class A2{
    static int a=10;
    static{
        System.out.println("In A SB");
        System.out.println("a: "+a);
        //System.out.println("b: "+b);
        System.out.println("b: "+B2.b);
        System.out.println("b: "+B2.getB());
    }
}
public class B2 extends A2{
    static int b=20;
    static{
        System.out.println("In B SB");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("b: "+getB());
    }
    static int getB(){
        int b=100;
        return b;
    }
    public static void main(String[] args){
        System.out.println("In B main");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
