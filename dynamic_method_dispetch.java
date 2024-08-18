// dynamic method dispetch this is also known as runtime polymorphisam

import java.util.Scanner;
class Phone{
    public void greet(){
        System.out.println("Good morning");
    }

    public void name(){
        System.out.println("my name is java");
    }
}

class SmartPhone extends Phone{
   
    public void swagat(){
        System.out.println("apka swagat hain");
    }
    @Override
     public void name(){
        System.out.println("my nmame is java in class two ");
    }
}

class Dynamic_method{
    public static void main(String[] args){

        // Phone obj = new Phone(); // allowed
        // SmartPhone sobj = new SmartPhone(); //allowed
        // obj.name();

        Phone obj = new SmartPhone();   // new SmartPhone(); this is a super class object , Phone obj = this is refreance
      //SmartPhone obj = new Phone(); // not allowed
        obj.name();   
        // obj.swagat(); // not allowed                   
    }
}