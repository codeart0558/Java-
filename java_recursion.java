// java Recursions
// put

import java.util.Scanner;
class Recursion{
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
        return n * factorial(n-1);
        }
    }
    public static void main(String[] args){
         int a = 3;
         System.out.println("factorial of number is : " + factorial(a));
    }
}