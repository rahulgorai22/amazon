class Solution{
    public static class Node{
        private int data;
        private Node left;
        private Node right;
        Node(int data){
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        Node root;
        BinaryTree(){
            root=null;
        }
        //InOrder Tree traversal
        public static void inorderTraversal(Node node){
            if (node==null) return
            inorderTraversal(node.left);
            System.out.println(node.data+" ");
            inorderTraversal(node.right);
        }
        //PreOrder Tree Traversal
        public static void preorderTraversal(Node node){
            if (node==null) return
            System.out.println(node.data+" ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
        //PostOrder tree traversal
        public static void postOrderTraversal(Node node){
            if (node==null) return
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.inorderTraversal(tree.root);
    }
}