
// this is a referance 
// super is also a refreance variable
import java.util.Scanner;
class TS{
    int a;
    public TS(int a){
        this.a = a;
  System.out.println("value of a is  : " + a);
    }
}

class Ts2 extends TS{
    public Ts2(int a){
         super(a);
         System.out.println("i am pass variable a using  super method : ");
    }
}
class ThisSuper{
    public static void main(String[] args){
        Ts2 value = new Ts2(78);
    }
}