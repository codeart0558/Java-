// put
import java.util.Scanner;
class Employee{
    int salary = 90000;
    String name;
    public int get_salary(){
        return salary;
    }
    public String get_name(){
        return name;

    }
    public void setname(String n){
        name = n;
    }
}
class practiceQOne{
    public static void main(String[] args){
 Employee d = new Employee();
 d.setname("drashti");
 System.out.println(d.get_name());
  System.out.println(d.get_salary());
    }
}