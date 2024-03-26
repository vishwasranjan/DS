class Node{
    int data;
    Node right;
    Node left;
    Node(int key){
        this.data=key;
        left=null;
        right=null;
    }
}
class BinaryTree{
    //root left right
    public static void preOrderTraversal(Node node){
        if(node==null) return;
        System.out.print(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void inOrderTraversal(Node node){
        if(node==null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data);
        inOrderTraversal(node.right);
    }
    public static void postOrderTraversal(Node node){
        if(node==null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data);
    }
    public static void main(String args[]){
        Node root=new Node(1); 
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.right=new Node(3);
        root.right.left=new Node(7);
        root.right.right=new Node(8);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(10);
        System.out.print("Preoder = ");
        preOrderTraversal(root);
        System.out.print("Intoder = ");
        inOrderTraversal(root);
        System.out.print("Postoder = ");
        postOrderTraversal(root);
    }
}