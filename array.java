// Create a Student class with the following properties: name, grade, and age. Implement the following
// methods:
// setName(String name): Sets the student's name.
// getGrade(): Returns the student's grade.
// incrementAge(): Increments the student's age by 1.
// printStudentInfo(): Prints the student's name, grade, and age.
// In the main method, create an array of Student objects and perform the following tasks:
// Prompt the user to enter the number of students.
// Create the Student objects and populate their information.
// Use a for loop to iterate through the array and call the printStudentInfo() method for each
// student.
// Find the student with the highest grade and print their information.
// Note: Remember to include appropriate comments and documentation throughout your code to
// make it more readable and maintainable.
// import java.util.Scanner;
// class Student{
//     String name;
//     int age;
//     int[] marks = new int[5];

//     void set_data(String _name,int _age,int[] _marks){
//         name = _name;
//         age = _age;
//         for(int i=0;i<_marks.length;i++){
//             marks[i] = _marks[i];
//         }
//     }

//     void print_data(){
//         System.out.println("Student Name : " + name);
//         System.out.println("Student age : " + age);
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }
//     }

//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter number for array : ");
//         int num = s.nextInt();
//         Student[] stu = new Student[num];

//         for(int i=0;i<num;i++){
//             stu[i] = new Student();
//               System.out.println("enter name : ");
//             String _name = s.next();
//             s.nextLine();

//             System.out.println("enter age");   
//             int _age = s.nextInt();
//             s.nextLine();

//             int[] _marks = new int[5];
//   System.out.println("enter marks");
//             for(int j=0;j<_marks.length;j++){
//                 _marks[j] = s.nextInt();
//             }
//             s.nextLine();

//             stu[i].set_data(_name,_age,_marks);
//         }

//         for(int i=0;i<num;i++){
//             System.out.println("_______________");
//             stu[i].print_data();
//         }
//     }

// }

// array is a collection of similar type of data
// import java.util.Scanner;
// class Array{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);

//         int[] marks = {100,101,102,103};

//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }
//  System.out.println("foreach loop");
//         for(int elements : marks){
//              System.out.println(elements);
//         }
//     }
// }


