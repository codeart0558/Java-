// we create a custome exception using extend exception class

// import java.util.Scanner;

// class MyException extends Exception {
//     @Override
//     public String toString() {
//         return" i am toString()";
//     }

//     @Override
//     public String getMessage() {
//         String message = super.getMessage();
//         return " i am getMessage()";
//     }
// }

// class Exception_class {
//     public static void main(String[] args) {
//         int a;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         a = sc.nextInt();

//         if (a < 99) {
//             try {
//                 throw new MyException();
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 System.out.println(e);
//                 e.printStackTrace();
//                 System.out.println("finished!");
//             }
//         }
//         else
//         {
//             System.out.println("print number is  :" + a);
//         }
//     }
// }

//------------------------------------------------------------
// throw or throws
// when use throw or when throws
// class MExceptionnegetive extends Exception{
//     @Override
//     public String toString(){
//         return "i am the best & radius can not be an nagative ";
//     }
// }
// class Exception_class {
//     public static double area(int r) throws MExceptionnegetive{
//         if(r < 0){
//             throw new MExceptionnegetive();
//         }

//          double result = Math.PI * r * r;
//          return result;
//     }
//     // made by i
//    public static int devide(int a,int b) throws ArithmeticException{
//         int result = a/b;
//         return result;
//     }
//     public static void main(String[] args) {
//         // you - use divide function created by i
//         try{
//              int c = devide(6,0);
//                      System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println("Exception");
//         }
//          // for negetive number 
//         try{
//             // area(-1);
//             area(1);
//             // System.out.println(area);

//         }
//         catch(Exception e){
//             System.out.println("nagative");
//         }
     

//     }
// }
