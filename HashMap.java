public class HashMap
{
    class HashNode
    {
        String key;
        String value;
        HashNode next;
        public HashNode(String key,String value)
        {
            this.key=key;
            this.value=value;
        }
    }
    public HashNode[] hashTable=null;
    private int bucketsize=16;
    int size=0;
    public HashMap()
    {
        this.hashTable=new HashNode[bucketsize];
    }
    public void put(String key,String value)
    {
        int position=hash(key);
        System.out.println("Key - "+key);
        System.out.println("Position - "+position);
        HashNode node=hashTable[position];
        if(node==null)
        {
            hashTable[position]=new HashNode(key,value);
            size++;
        }
        else
        {
            while(node.next!=null && node.key!=key)
            {
                node=node.next;
            }
            if(node.key==key)
            {
                node.value=value;
            }
            else
            {
                node.next=new HashNode(key,value);
                size++;
            }
        }
    }

    public boolean remove(String key)
    {
        int position=hash(key);
        HashNode target=hashTable[position];
        HashNode cur=target;
        HashNode pre=null;
        while(cur!=null && cur.key!=key)
        {
            pre=cur;
            cur=cur.next;
        }
        if(cur==null)return false;
        if(pre==null)
        {
            hashTable[position]=cur.next;
        }
        else{
            pre.next=cur.next;
            cur.next=null;
        }
        size--;
        return true;
    }

    public String get(String key)
    {
        HashNode cur=find(key);
        if(cur==null)
        return null;
        return cur.value;
    }

    public boolean contains(String key)
    {
        HashNode target=find(key);
        return target!=null;
    }
    public HashNode find(String key)
    {
        int position=hash(key);
        HashNode cur=hashTable[position];
        if(cur==null)
        return null;
        else{
            while(cur!=null && cur.key!=key)
            {
                cur=cur.next;
            }
        }
        return cur;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void clear()
    {
        size=0;
        this.hashTable=new HashNode[bucketsize];
    }

    
    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("{");
        for(int i=0;i<bucketsize;i++)
        {
            HashNode node=hashTable[i];
            while(node!=null)
            {
                sb.append(node.key+"="+node.value+",");
                node=node.next;
            }
        }
        if(sb.length()>1)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("}");
        return sb.toString();
    }
    public int hash(String key)
    {
        return Math.abs(key.hashCode())%bucketsize;
    }
    public static void main(String[] args)
    {
        HashMap h=new HashMap();
        h.put("one","ONE");
        h.put("two","TWO");
        h.put("three","THREE");
        h.put("four","FOUR");
        h.put("one","Modified value");
        System.out.println(h);
       // System.out.println(h.contains("one"));
        //System.out.println(h.get("five"));
        h.remove("four");
        System.out.println(h);
        h.remove("one");
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h);
    }
}