import java.util.ArrayList;

class LinkedList
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
        else{
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
        Node newnode=new Node(data);
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
            newnode.next=head;
            head=newnode;
        }
        else
        {
            pre.next=newnode;
            newnode.next=cur;
        }
        size++;
        System.out.println(this);
    }
    public void remove(int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.println("Index is out of range");
            return;
        }
        Node pre=null;;
        Node cur=head;
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
        else if(cur==tail)
        {
            tail=pre;
            pre.next=null;
        }else
        {
            pre.next=cur.next;
        }
        size--;
        System.out.println(this);

    }

    //Approach using ArrayList
    // public void reverse()
    // {
    //     ArrayList<Node> list=new ArrayList<Node>();
    //     Node cur=head;
    //     while(cur!=null)
    //     {
    //         list.add(cur);
    //         cur=cur.next;
    //     }
    //     int size=list.size();
    //     for(int i=size-1;i>0;i--)
    //     {
    //         list.get(i).next=list.get(i-1);
    //         list.get(i-1).next=null;
    //     }
    //     head=list.get(size-1);
    //     System.out.println(this);
    // }
    public void reverse()
    {
        Node pre=null;
        Node next=null;
        Node cur=head;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;     
        }
        head=pre;
        System.out.println(this);
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       sb.append("[");
       Node cur=head;
       while(cur!=null)
       {
           sb.append(cur.data).append(",");
           cur=cur.next;
       }
       sb.deleteCharAt(sb.length()-1);
       sb.append("]");
        return sb.toString();
    }
    public static void main(String srgs[])
    {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(15,1);
        ll.add(5,0);
        ll.add(30);
        // ll.remove(1);
        // ll.remove(0);
        // ll.remove(2);
        ll.reverse();
    }
}