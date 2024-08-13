// function or method in java
// fucntion follow dry = do not repeat your self
 // int x,int y parameter , addtwonumber = identifirez and pass copy not actual paramter
import java.util.Scanner;
class Method{
    static int addtwonumber(int x,int y){
    int c = x + y;
    return c;
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("add number sum is : " + addtwonumber(a,b));
    }
}


// method invocation using object creation
// import java.util.Scanner;
// class Method{
//     int addtwonumber(int x,int y){ 
//     int c = x + y;
//     return c;
//     }
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//          Method m = new Method();
//          int add = m.addtwonumber(a,b);
//          System.out.println("add number sum is : " + add);
//         }
// }