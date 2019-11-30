class LinkedList{
    static Node head;
    static int multiple=0;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node reverseInGroup(Node head,int k,int n){
        Node current=head;
        Node next=null;
        Node prev=null;
        int count=0;
        multiple=multiple+k;
        System.out.println(multiple+"lalal"+n);
        while(count<k && current!=null && multiple<n){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if (next!=null )
            head.next=reverseInGroup(next, k,n);
        return prev;
    }
    public static void push(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList(); 
          
        /* Constructed Linked List is 1->2->3->4->5->6-> 
           7->8->8->9->null */
        llist.push(11); 
        llist.push(10); 
        llist.push(9); 
        llist.push(8); 
        llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1);  
        System.out.println("\nGiven Linked List"); 
        llist.printList(llist.head);
        int n=llist.length(llist.head);
        llist.head = llist.reverseInGroup(llist.head, 3,n); 
        System.out.println("\nReversed list"); 
        llist.printList(llist.head); 
    }
}