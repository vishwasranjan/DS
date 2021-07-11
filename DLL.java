public class DLL 
{
    class Node{
        int data;
        Node next;
        Node pre;
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
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.pre=tail;
            tail=newnode;
        }
        size++;
        System.out.println(this);
    }
    public void add(int data,int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.print("Index is out of range  ");
            return;
        }
        Node newnode=new Node(data);
        Node cur=findNode(index);
        if(cur==head)
        {
            newnode.next=head;
            head.pre=newnode;
            head=newnode;
        }
        else{
            Node preNode=cur.pre;
        preNode.next=newnode;
        newnode.pre=preNode;
        newnode.next=cur;
        cur.pre=newnode;
        }
        size++;
        System.out.println(this);
       
    }
    public void remove(int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.print("Index is out of range  ");
            return;
        }
        Node cur=findNode(index);
        Node preNode=cur.pre;
        Node nextNode=cur.next;
        if(cur==head)
        {
            head=cur.next;
            if(head!=null)
            {
                head.pre=null;
            }
            else
            {
                head=tail=null;
            }
            
        }
        else if(cur==tail){
            tail=cur.pre;
            tail.next=null;
        }
        else{
        preNode.next=nextNode;
        nextNode.pre=preNode;
        }

        cur.next=cur.pre=null;
        size--;
        System.out.println(this);
    }
    public void removeObj(int data)
    {
        Node cur=head;
        while(cur!=null && cur.data!=data)
        {
            cur=cur.next;
        }
        if(cur==null)
        {
            System.out.println("Data dosent found");
            return;
        }
        Node preNode=cur.pre;
        Node nextNode=cur.next;
        if(cur==head)
        {
            head=cur.next;
            head.pre=null;
        }
        else if(cur==tail){
            tail=cur.pre;
            tail.next=null;
        }
        else{
        preNode.next=nextNode;
        nextNode.pre=preNode;
        }

        cur.next=cur.pre=null;
        size--;
        System.out.println(this);
    }
    public int indexOf(int data)
    {
        int i=0;
        Node cur=head;
        while(cur!=null && cur.data!=data)
        {
            cur=cur.next;
            i++;
        }
        if(cur==null)
        {
            return -1;
        }
        return i;
    }
    public int LastindexOf(int data)
    {
        int i=(size-1);
        Node cur=tail;
        while(cur!=null && cur.data!=data)
        {
            cur=cur.pre;
            i--;
        }
        if(cur==null)
        {
            return -1;
        }
        return i;
    }
    public Node findForward(int index)
    {
        int i=0;
        Node cur=head;
        while(cur!=null && i!=index)
        {
            cur=cur.next;
            i++;
        }
        return cur;
    }
    public Node findBackward(int index)
    {
        int i=(size-1);
        Node cur=tail;
        while(cur!=null && i!=index)
        {
            cur=cur.pre;
            i--;
        }
        return cur;
    }
    public int get(int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.print("Index is out of range  ");
            return Integer.MIN_VALUE;
        }
            Node target=findNode(index);
        return target.data;

    }
    public Node findNode(int index)
    {
        int mid=(size/2);
            if(index<mid)
            {
            return findForward(index);
            }
            else
            {
            return findBackward(index);
            }

    }
    public boolean contains(int data)
    {
        return indexOf(data)==1;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {return size==0;}
    public void clear()
    {
        head=tail=null;
        size=0;
    }
    public void setdata(int data,int index)
    {
        if(index<0 || index>(size-1))
        {
            System.out.print("Index is out of range  ");
            return ;
        }
        Node cur=findNode(index);
        cur.data=data;
        System.out.println(this);
    }
    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        Node cur=head;
        while(cur!=null)
        {
            sb.append(cur.data).append(",");
            cur=cur.next;
        }
        if(sb.length()>1)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        // TODO Auto-generated method stub
        return sb.toString();
    }
    public static void main(String args[])
    {
        DLL dl=new DLL();
        dl.add(10);
        dl.add(20);
        dl.add(30);
        dl.add(50);
       // System.out.println("1nd Index is : "+dl.get(1));
        //System.out.println("3nd Index is : "+dl.get(3));
        //System.out.println("5nd Index is : "+dl.get(5));
        dl.add(100,2);
        dl.add(0,0);
        dl.remove(1);
        dl.remove(0);
        dl.remove(3);
        dl.removeObj(20);
        dl.add(30);
        dl.add(30,0);
        System.out.println("Index of 30 is "+dl.indexOf(30));
        System.out.println("Last Index of 30 is "+dl.LastindexOf(30));
        System.out.println("Contains 100 "+dl.contains(100));
        System.out.println("Size of ll is "+dl.size());
        System.out.println("Dll is empty "+dl.isEmpty());
        // dl.clear();
        // System.out.println("Size of ll is "+dl.size());
        // System.out.println(dl);
        // System.out.println("Dll is empty "+dl.isEmpty());
        dl.setdata(50,1);
    }
    
}
