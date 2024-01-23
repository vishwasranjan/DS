import java.util.*;
class Hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>(); //initialize
        map.put("india",12);    //insert
        map.put("china",76);
        System.out.println(map);
        System.out.println(map.containsKey("india")); //Search  =>  Return true if exist else false
        System.out.println(map.get("china"));   //Get   => get the value

        //iterate the hashmap
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
        map.remove("china");    //Delete    =>  delete the value
        System.out.println(map);
    }
}