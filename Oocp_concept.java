// terminology : 
// 1.abstraction : hiding internal details
// 2.encapsulation : the act of putting various components together ( in a capsule)
// 3.inheritance : the act of during new things from existing things
// 4.polymorphism : one name multiple task

 // writing a custom class
 //put
 class Student{
     int id;
     String name;
     void set_details(int _id,String _name){
       id = _id;
       name = _name;
     }
     void print_detils(){
        System.out.println("Student id ia : " +  id + " and " + "Student name is : " + name);
     }

 }

class CustomClass{
    public static void main(String[] args){
       Student stu = new Student();
       stu.set_details(1,"drashti");
       stu.print_detils();
    } 
}