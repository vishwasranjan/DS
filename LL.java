public class LL
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    Node head;
    Node tail;
    int size=0;
    public void add(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
        size++;
        System.out.println(this);
    }
    public void add(int data,int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.println("Index is out of range");
            return;
        }
        Node cur=head;
        Node pre=null;
        int i=0;
        while(cur!=null && i!=index)
        {
            pre=cur;
            cur=cur.next;
            i++;
        }
        Node newnode=new Node(data);
        if(pre==null)
        {
            newnode.next=head;
            head=newnode;
        }else{
            pre.next=newnode;
            newnode.next=cur;
        }
        size++;
        System.out.println(this);
    }
    public void get(int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.println("Index is out of range");
            return;
        }
        Node cur=head;
        int i=0;
        while(cur!=null && i!=index)
        {
            cur=cur.next;
            i++;
        }
        System.out.println(index+" th position is : "+cur.data);
    }
    public void set(int data,int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.println("Index is out of range");
            return;
        }
        Node cur=head;
        int i=0;
        while(cur!=null && i!=index)
        {
            cur=cur.next;
            i++;
        }
        cur.data=data;
        System.out.println(this);   
    }
    public void indexof(int data)
    {
        Node cur=head;
        int i=0;
        int indexof=-1;
        while(cur!=null)
        {
            if(cur.data==data)
            {
                indexof=i;
                break;
            }
            cur=cur.next;
            i++;
        }
        System.out.println(data+" is in index : "+indexof);
    }
    public void Lastindexof(int data)
    {
        Node cur=head;
        int i=0;
        int indexof=-1;
        while(cur!=null)
        {
            if(cur.data==data)
            {
                indexof=i;
            }
            cur=cur.next;
            i++;
        }
        System.out.println("Last index of "+data+" is : "+indexof);
    }
    public boolean contains(int data)
    {
        Node cur=head;
        int i=0;
        boolean b=false;
        while(cur!=null)
        {
            if(cur.data==data)
            {
             b=true;   
            }
            cur=cur.next;
            i++;
        }
        return b;   
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return (size==0);
    }
    public void clear()
    {
        head=tail=null;
        size=0;
    }
    public void remove(int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.println("Index is out of range");
            return;
        }
        Node cur=head;
        Node pre=null;
        int i=0;
        while(cur!=null && i!=index)
        {
            pre=cur;
            cur=cur.next;
            i++;
        }
        if(pre==null)
        {
            head=head.next;
        }
        else{
            pre.next=cur.next;
        }
        if(cur==tail)
        {
            tail=pre;
        }
        cur.next=null;
        size--;
        System.out.println(this);
    }
    public void removeObject(int data)
    {
        Node cur=head;
        Node pre=null;
        while(cur!=null && cur.data!=data)
        {
            pre=cur;
            cur=cur.next;
        }
        if(cur==null)
        {
            System.out.println("Target data not found");
        }
        if(pre==null)
        {
            head=head.next;
        }else{
            pre.next=cur.next;
        }
        if(cur==tail)
        {
            tail=pre;
        }
         cur.next=null;
        size--;
        System.out.println(this);
    }
    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("[");
        Node cur=head;
        while(cur!=null)
        {
            s.append(cur.data).append(",");
            cur=cur.next;
        }
        if(s.length()>2)
        {
            s.deleteCharAt(s.length()-1);
        }
        s.append("]");
        // TODO Auto-generated method stub
        return s.toString();
    }

    public static void main(String args[])
    {
        LL ls=new LL();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(20);
        ls.indexof(20);
        ls.Lastindexof(20);
        ls.indexof(30);
        ls.indexof(1000);
        System.out.println("20 data exist : "+ls.contains(20));
        System.out.println("200 data exist : "+ls.contains(200));
        System.out.println("Size : "+ls.size());
        System.out.println("Linked List is Empty : "+ls.isEmpty());
        ls.clear();
        System.out.println("Size : "+ls.size());
        System.out.println(ls);
        // System.out.println("Removing 0th element");
        // ls.remove(0);
        // System.out.println("Removing last element");
        // ls.remove(3);
        // System.out.println("Adding element");
        // ls.add(60);
        // System.out.println("Removing 10 element");
        // ls.removeObject(10);
        // System.out.println("Removing 20 element");
        // ls.removeObject(20);
        // ls.removeObject(60);
        // ls.removeObject(40);
    }
}