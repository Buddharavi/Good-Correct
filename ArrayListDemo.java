import java.util.*;
class ArrayListDemo
{
      public static void main(String[] args)
      {
	ArrayList I = new ArrayList();
	I.add("A");
	I.add(10);
	I.add("A");
	I.add(null);
	System.out.println(I);
	I.remove(2);
	System.out.println(I);
	I.add(2,"M");
	I.add("N");
	System.out.println(I);
      }
}	