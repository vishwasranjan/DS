class LinkedList2{
    //Node
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add first
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    //add Last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
    }

    //delete first
    public void deleteFirst()
    {
        if(head!=null)
        {
            head=head.next;
        }
    }

    //delete last
    public void deleteLast()
    {
        if(head!=null)
        {
            Node current=head;
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    }

    //Print the List
    public void printList()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else{
            Node current=head;
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        LinkedList2 LL2=new LinkedList2();
        LL2.addFirst("am");
        LL2.addFirst("I");
        LL2.addLast("Vishwas");
        LL2.addLast("Ranjan");
        LL2.addFirst("Intro");
        LL2.printList();
        LL2.deleteFirst();
        LL2.printList();
        LL2.deleteLast();
        LL2.printList();
    }
}