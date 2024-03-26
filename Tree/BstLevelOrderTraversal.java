import java.util.*;
class BstLevelOrderTraversal{
    public List<List<Integer>> LevelOrderTraversal(Node root){
        Queue<Node> queue=new LinkedList<>();
        List<List<Integer>> wrapList=new ArrayList<List<Integer>>();
        if(root==null) return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> subList=new ArrayList<Integer>();
            int sizeQueue=queue.size();
            for(int i=0;i<sizeQueue;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
    public static void main(String args[]){
        Node node=new Node(1);
        node.left=new Node(2);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right=new Node(3);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        BstLevelOrderTraversal BstLevelOrderTraversal=new BstLevelOrderTraversal();
        List<List<Integer>> list=BstLevelOrderTraversal.LevelOrderTraversal(node);
        for(List l:list){
            System.out.print(l);
        }
    }
}