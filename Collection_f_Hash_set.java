// use beause we can serch in constant time 
// use hashset methods using or read from hash set documentation
import java.util.*;
class Collection_f_Hash_set{
    public static void main(String[] args){
        
        // if not give capacity ,instance has default intial capacity(16) and load fector(0.75)
        // HashSet<Integer> myHashset = new HashSet<>();

        // you can keep your own capacity and loadfector
        HashSet<Integer> myHashset = new HashSet<>(6,0.5f);
        myHashset.add(6);
        myHashset.add(4);
        myHashset.add(11);
        myHashset.add(5);
        myHashset.add(11); 
        // not take a hashset is duplicate value
        System.out.println(myHashset); // [11, 4, 5, 6] :  O / P

    }
}