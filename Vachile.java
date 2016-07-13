abstract class Vachile
{  
 abstract void speed();  
 void mileage()
{
 System.out.println("Mileage is 60 km/ltr..");
}
}  
class Bike extends Vachile
{  
void speed()
{
System.out.println("Speed limit is 40 km/hr..");
}
public static void main(String args[])
{
 Vachile obj = new Bike();  
 obj.speed();
 obj.mileage();
 }  
}