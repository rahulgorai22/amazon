import java.util.Queue;

class Sloution{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    class BinaryTree{
        Node root;
        public static void levelOrderTraversal(){
            Queue<Node> queue=new Queue<Node>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node temp=queue.poll();
                System.out.println(temp.data+" ");
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree_level = new BinaryTree(); 
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
        tree_level.levelOrderTraversal();
    }
}