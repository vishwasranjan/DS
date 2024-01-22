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