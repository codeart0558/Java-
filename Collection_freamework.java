
// what is collection framework!
//--> collection represents a group of object.
//--> java collections combinations of a classes and interface 


// iterable interface
//      ^
//      |
//      |
// collection
//      ^
//      |
// -----------------
// list  queue   set 



// methods on collections
// add,size,remove,iterate,addAll,removeAll,clear
 
//              list
//              ^
//              |
// -----------------------------------------
// arraylist linklist vector
//                       ^
//                       |
//                       stack
                    

//      queue interface(FIFO)
//                ^
//                |
//                |
// -------------------------------------
// priporty queue  ll   dequeue
//                       ^
//                       |
//                       |
//                       arrayDequeue



//     set interface
//                ^
//                |
//                |
// -------------------------------------
// hashset       ll    sortedset
//                       ^
//                       |
//                      treeset                      



        

//     map interface
//                ^
//                |
//                |
// -------------------------------------
// hashmap     ll    sortedmap   hashtable
//                       ^
//                       |
//                      treemap                      



//--------------------------------------
// example 1: arraylist

// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(0,100);

//            for(int i=0;i<l1.size();i++){
//               System.out.println(l1.get(i));
//            }
//     }
// }

// example 2:

// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
//            ArrayList<Integer> l2 = new ArrayList<>(5);  // we can set intial apacity
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(66);
//            l1.add(76);
//            l1.add(66);
//            l1.add(26);
//            l1.add(76);
//            l1.addAll(l2);
        

//            for(int i=0;i<l1.size();i++){
//               System.out.println(l1.get(i));
//            }
//     }
// }

// example 3:
 
// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
//            ArrayList<Integer> l2 = new ArrayList<>(5);  // we can set intial apacity
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(66);
//            l1.add(76);
//            l1.add(66);
//            l1.add(26);
//            l1.add(76);
//            l1.addAll(l2);
        
//            for(int i=0;i<l1.size();i++){
//             System.out.println(l1.get(i));
//          }
//             l2.clear();
//     }
// }

// example 4

// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
//            ArrayList<Integer> l2 = new ArrayList<>(5);  // we can set intial apacity
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(66);
//            l1.add(76);
//            l1.add(66);
//            l1.add(26);
//            l1.add(76);
//            l1.addAll(l2);
//          System.out.println(l1.contains(7));  // return true or false
//     }
// }

// example 5

// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
//            ArrayList<Integer> l2 = new ArrayList<>(5);  // we can set intial apacity
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(66);
//            l1.add(76);
//            l1.add(66);
//            l1.add(26);
//            l1.add(76);
//            l1.addAll(l2);
//          System.out.println(l1.indexOf(76));  
//          System.out.println(l1.lastIndexOf(76)); 
//          for(int i=0;i<l1.size();i++){
//                         System.out.print(l1.get(i));
//                         System.out.print(" , ");
//                      }
//     }
// }

//example 6 : remove element from the list

// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
//            ArrayList<Integer> l2 = new ArrayList<>(5);  // we can set intial apacity
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(66);
//            l1.add(76);
//            l1.add(66);
//            l1.add(26);
//            l1.add(76);
//            l1.addAll(l2);
//            for(int i=0;i<l1.size();i++){
//             System.out.print(l1.get(i));
//             System.out.print(" , ");
//          }
//          System.out.println();
//            l1.remove(3);
//          for(int i=0;i<l1.size();i++){
//                         System.out.print(l1.get(i));
//                         System.out.print(" , ");
//                      }
//     }
// }

// example 7 set remove element from the list

// import java.util.*;
// class Collection_freamework{
//     public static void main(String[] args){
//            ArrayList<Integer> l1 = new ArrayList<>(); // arraylist is a modified array
           
//            l1.add(6);
//            l1.add(7);
//            l1.add(6);
//            l1.add(2);
//            l1.add(7);
//            l1.add(66);
         
//            for(int i=0;i<l1.size();i++){
//             System.out.print(l1.get(i));
//             System.out.print(" , ");
//          }
//          System.out.println();
//            l1.set(1,3000);
//          for(int i=0;i<l1.size();i++){
//                         System.out.print(l1.get(i));
//                         System.out.print(" , ");
//                      }
//     }
// }

// another whole method leran from documentaion.....