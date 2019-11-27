import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

class Soultion{
    static class Node{
        public int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        Node root;
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        public void findVerticalSum(Node root,int horizontalDistance){
            if (root==null) return;
            // Inorder traversal to add the sums to tree map with horizontal distance as key
            findVerticalSum(root.left, horizontalDistance-1);
            int previousSum= (map.get(horizontalDistance)==null)?0:map.get(horizontalDistance);
            map.put(horizontalDistance,previousSum+root.data);
            findVerticalSum(root.right, horizontalDistance+1);
        }
        public void printVerticalSums(TreeMap<Integer,Integer> map){
            if(map!=null){
                for(Entry<Integer,Integer> it:map.entrySet()){
                    System.out.println(it.getValue());
                }
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.root.right.left.right = new Node(8); 
        tree.root.right.right.right = new Node(9);
        tree.findVerticalSum(tree.root, 0);
        tree.printVerticalSums(tree.map);
    }
}