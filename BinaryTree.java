public class BinaryTree 
{
    Node root;
    public void add(int data)
    {
        root=addToNode(root,data);
    }
    public Node addToNode(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=addToNode(root.left, data);
        }
        else if(data>root.data)
        {
            root.right=addToNode(root.right, data);
        }
        return root;
    }
    public void inorder(Node root)
    {
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
 public static void main(String args[])
 {
    BinaryTree bst=new BinaryTree();
    bst.add(20);
    bst.add(10);
    bst.add(5);
    bst.inorder();

 }  

}
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
    }
}