import java.util.Scanner;

import org.graalvm.compiler.hotspot.stubs.CreateExceptionStub;

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
        Node root=t.createTree();
        System.out.println("Inorder : ");
        t.inorder(root);
        System.out.println();
        System.out.println("Preorder : ");
        t.preorder(root);
        System.out.println();
        System.out.println("Postorder : ");
        t.postorder(root);
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
    public void inorder(Node root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public void preorder(Node root)
    {
        if(root==null)
        return ;
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root==null)
        return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
}
