// interface : is a group of releted methods with empty bodies
// interface is group of method 
import java.util.Scanner;

interface Bicycle{
    int a = 45;
    void applybreak(int decreament);
    void speedup(int increment);
}

class Avonecycle implements Bicycle{
       void blowhoron(){
        System.out.println("music is ...");
       }

       public void applybreak(int decreament){
        System.out.println("apply break");
       }
 
       public void speedup(int increment){
        System.out.println("apple sped");
    }
}

class Interface{
    public static void main(String[] args){
        Avonecycle c = new Avonecycle();
        c.applybreak(1);
         System.out.println(c.a);
        // you can not modify properties in interface as they are final
        // c.a = 90; // we can not change beacuse that is final variable
        //    system.out.println(c.a);
    }
}