// 1.access modifer means where propertis and methods is accessible
// private  variable we can use using methods
// put

import java.util.Scanner;
class Emp{
    private int id;
    private String name;

    public void Set(int _id,String _name){
        id = _id;
        name = _name;
        System.out.println(id + " " +name);
    }

}
class MSG{
   public static void main(String[] args){
     Emp d = new Emp();
     int id = 1;
      String name = "Drashti";
    d.Set(id,name);
      }
    
}
