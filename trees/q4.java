class Solution{
    static class Node{
        private int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Values{
        int min;
        int max;
        Values(){
            this.min=0;this.max=0;
        }
    }
    static class BinaryTree{
        Node root;
        Values val=new Values();
        public void findMinMax(Node node,Values min,Values max,int hd){
            if(node==null)
                return;
            if(hd < min.min){
                min.min=hd;
            } 
            else if(hd>max.max){
                max.max=hd;
            }
            findMinMax(node.left, min, max, hd-1);
            findMinMax(node.right, min, max, hd+1);
        }
        public void printVerticalLine(Node node,int lineNo,int hd){
            if (node==null)
                return;
            if (hd==lineNo)
                System.out.print(node.data+" ");
            printVerticalLine(node.left, lineNo, hd-1);
            printVerticalLine(node.right, lineNo, hd+1);
        }
        public void printVerticalOrder(Node node){
            findMinMax(node, val, val, 0);
            for(int lineNo=val.min;lineNo<=val.max;lineNo++){
                printVerticalLine(node,lineNo,0);
                System.out.println("");
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
        tree.printVerticalOrder(tree.root);
    }
}