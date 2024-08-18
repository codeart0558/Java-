// multiple inheritance, more base class and one derived class
// java  dose  not allow multiple inheritance
// using interface allow multiple inheritance

// (C)Cellphone    (I)GPS    (I)Camera  (I)Media_player
//     |             |
//      |            |
//       |           |
//           SmartPhone

// GPS g = new SmartPhone(); only use GPS 
// we can not create object of interfaces
// we can create refreance of interfaces
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
    }
}