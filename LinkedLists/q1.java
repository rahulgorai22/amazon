public class LinkedList{
    static Node head;
    public static class Node{
        Node next;
        private int data;
        // Signature of a linked list node
        Node(int data){
            this.data=data;
            this.next=null;
        }
        // Insert a node at the front of the linked list
        public static void insert(int data){
            Node newNode=Node(data);
            newNode.next=head;
            head=newNode;
        }
        public void insertAfter(Node previousNode,int data){
            Node newNode=new Node(data);
            if(previousNode==null) System.out.println("Invalid");
            newNode.next=previousNode.next;
            previousNode.next=newNode;
        }
        public void appendLast(int data){
            Node newNode=new Node(data);
            Node temp=head;
            if(head==null){
                // Condition when LL doesen't even exists
                head=new Node(data);
            }
            newNode.next=null;
            while(temp!=null){
                temp=temp.next;
            }
            newNode.next=null;
            temp.next=newNode;
        }
        public void printList(Node head){
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(4);
    }
}