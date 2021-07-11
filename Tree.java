import java.util.Scanner;

class Node
{
    Node left;
    Node right;
    int data;
    public Node(int data){this.data=data;}
}
public class Tree
{
    Scanner sc=new Scanner(System.in);;
    public static void main(String args[])
    {
        Tree t=new Tree();
        t.createTree();
    }
    public Node createTree()
    {
        Node root=null;
        System.out.println("Enter data : ");
        int data=sc.nextInt();
        if(data==-1)
        return root;
        else
        {   
            root=new Node(data);
            System.out.println("Enter left for "+data);
            root.left=createTree();
            System.out.println("Enter right for "+data);
            root.right=createTree();
        }
        return root;
    }
}
