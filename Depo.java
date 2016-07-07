/**
 * Created by DhanaSM on 07-07-2016.
 */
interface Vehicle{
    public void engine();
    public void breaks();
}
abstract class Bus implements Vehicle{
    public void breaks(){
        System.out.println("Bus has two breaks");
    }
}
class RedBus extends Bus{
    public void engine(){
        System.out.println("RedBus capacity is 40 kmph");
    }
}
class Volvo extends Bus{
    public void engine(){
        System.out.println("Volvo capacity is 110 kmph");
    }
}
class Driver{
    public void assignVehicle(Vehicle v){
        v.breaks();
        v.engine();
    }
}
public class Depo {
    public static void main(String args[]){
        Driver driver1=new Driver();
        driver1.assignVehicle(new Volvo());
        Driver driver2=new Driver();
        driver2.assignVehicle(new RedBus());
    }
}
