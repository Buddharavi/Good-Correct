class problem{
    int z;
    public void addition(int x, int y){
        z=x+y;
        System.out.println("sum of given  numbers is :" +z);
    }
    public void subtraction(int x, int y){
        z=x-y;
        System.out.println("difference of given  numbers is :" +z);
    }
}
class solution extends problem {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:" + z);
    }
    public static void main(String args[]) {
        int a = 20, b = 10;
        solution demo = new solution();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}