// Linklist
import java.util.*;
public class Collection_framework_ll {
    public static void main(String[] args) {
          LinkedList<Integer> l1 = new LinkedList<>(); // arraylist is a modified array
        //   LinkedList<Integer> l2 = new LinkedList<>(); 
           l1.add(6);
           l1.add(7);
           l1.add(6);
           l1.add(2);
           l1.add(7);
           l1.addLast(23); // this is not work in arraylist
           
         for(int i=0;i<l1.size();i++){
                        System.out.print(l1.get(i));
                        System.out.print(" , ");
                     }
    }
}
