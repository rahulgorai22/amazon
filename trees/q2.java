import java.util.Stack;
class Solution{

static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
static class BinaryTree{
    Node root;
    public void inorder(){
        if (root==null){
            System.out.println("root is null");
        }
        Stack<Node> st=new Stack<Node>();
        Node current=root;

        while(st.size()>0){
            // Logic to push a node to stack
            while(current!=null){
                st.push(current);
                current=current.left;
            }
            // Logic to pop a node from stack
            Node out=st.peek();
            System.out.println(out.data+" ");
            st.pop();
            current=current.right;
        }
    }
}
public static void main(String[] args) {
    BinaryTree tree=new BinaryTree();
    tree.root=new Node(1);
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
    tree.root.left.left=new Node(4);
    tree.root.left.right=new Node(5);
    tree.inorder();
}
}