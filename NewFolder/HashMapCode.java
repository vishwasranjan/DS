//Implementation of HashMap
import java.util.*;
public class HashMapCode{
    //A Generic class simply means that the items or functions in that class can be generalized with the parameter(example T) 
    //to specify that we can add any type as a parameter in place of T like Integer, Character, String, Double or any other 
    //user-defined type.
    static class HashMap<K,V>{  //generic
        class Node
        {
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;//n is node number
        private int N;//N is bucket size
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<N;i++){
                this.bucket[i]=new LinkedList<>(); //need to initialize empty LL in every index of array of LL
            }
        }
        public int hashFunction(K key){ //0 to N-1
            int bucketIndex=key.hashCode();
            return Math.abs(bucketIndex) % N;
        }

        private int searchLL(K key,int bucketIndex){
            LinkedList<Node> ll=bucket[bucketIndex];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key)
                return i;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuckect[]=bucket;
            bucket=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBuckect.length;i++){
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){
            int bucketIndex=hashFunction(key);//get the bucket index by using hashFunction
            int dataIndex=searchLL(key,bucketIndex);//search the array of LL if data exist or not.If exist will return the dataindex or else -1
            if(dataIndex==-1){
                //doesnot exist
                bucket[bucketIndex].add(new Node(key,value));
                n++;    //increase the node count
            }else{
                //exist
                Node node=bucket[bucketIndex].get(dataIndex);
                node.value=value;
            }

            double lambda=(double)n/N;
            if(lambda>2.0){
                //rehashing
                rehash();
            }
        }
        public V get(K key){
            int bucketIndex=hashFunction(key);
            int dataIndex=searchLL(key,bucketIndex);
            if(dataIndex==-1){
                return null;
            }
            else{
                Node node=bucket[bucketIndex].get(dataIndex);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bucketIndex=hashFunction(key);
            int dataIndex=searchLL(key,bucketIndex);
            if(dataIndex==-1){
                return false;
            }
            else{
                return true;
            }
        }
        public V remove(K key){
            int bucketIndex=hashFunction(key);
            int dataIndex=searchLL(key,bucketIndex);
            if(dataIndex==-1){
                return null;
            }
            else{
                Node node=bucket[bucketIndex].remove(dataIndex);
                return node.value;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> ArraList=new ArrayList<>();
            for(int i=0;i<bucket.length;i++){//bucketIndex
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++){//dataIndex
                    Node node=ll.get(j);
                    ArraList.add(node.key);
                }
            }
            return ArraList;
        }
    }
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("China",220);
        map.put("US",100);
        ArrayList<String> array=map.keySet();
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i)+" "+map.get(array.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}