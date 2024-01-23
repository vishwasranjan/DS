// A few important features of HashSet are mentioned below:
//     >As it implements the Set Interface, duplicate values are not allowed.
//     >Objects that you insert in HashSet are not guaranteed to be inserted in the same order. 
//     Objects are inserted based on their hash code.
//     >NULL elements are allowed in HashSet.
//     HashSet<E> hs = new HashSet<E>();
import java.util.HashSet;
import java.util.Iterator;
//HashSet-Allow unique element only
//Time complexity for insert,delete and serach id O(1)
class HashShing{
    //Constins unique element onlt
    public static void main(String args[]){

    HashSet<Integer> set = new HashSet<Integer>();
    set.add(1); //Insert Operation
    set.add(2);
    set.add(1); //duplicate will not get added
    set.add(6);
    set.add(8);
    System.out.println(set);
    set.remove(8);  //Delete Operation
    System.out.println(set);
    System.out.println(set.contains(1));
    System.out.println(set.contains(8));

    Iterator it=set.iterator();
    while(it.hasNext()){    //hasNext will return true if any element is present or false if not
        System.out.println(it.next());
    }
    }
}