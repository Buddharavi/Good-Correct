class Employee
{
 int eid;  // data member (or instance variable)
 String ename;  // data member (or instance variable)
 eid=101;
 ename="Hitesh";
 public static void main(String args[])
 { 
  Employee e=new Employee(); // Creating an object of class Employee
  System.out.println("Employee ID: "+e.eid);
  System.out.println("Name: "+e.ename);
 }  
} 