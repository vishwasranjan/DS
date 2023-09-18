//How to reverse a Linked list

//before  1->2->3->4->5->6
//after   6->5->4->3->2->1

class ReverseLinkedList{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
    }

    public void printList()
    {
        Node newNode=head;
        while(newNode!=null)
        {
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }
        System.out.print("Null");
    }

    public void reverseLinkedList()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        else{
        Node rear=null;
        Node current=head;
        while(current!=null)
        {
            Node front=current.next;
            current.next=rear;
            rear=current;
            current=front;
        }
        head=rear;
        }
    }

    public static void main(String args[])
    {
        ReverseLinkedList list=new ReverseLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.printList();
        System.out.print("Reversed ");
        list.reverseLinkedList();
        list.printList();
    }
}