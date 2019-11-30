class LinkedList
{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static Node addNumbers(Node head1,Node head2){
        Node p=head1;
        Node q=head2;
        Node dummyHead=new Node(0);
        Node curr=dummyHead;
        int carry=0;
        while(p!=null || q!=null){
            int x=(p.data!=null)?p.data:0;
            int y=(q.data!=null)?q.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            curr.next=new Node(sum%10);
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
        }
        if(carry>0)
            curr.next=new Node(carry);
        return dummyHead.next;
    }
    public static void main(String[] args) {
        LinkedList llist1=new LinkedList();
        llist1.push(2); 
        llist1.push(4); 
        llist1.push(3); 
        LinkedList llist2=new LinkedList();
        llist2.push(5); 
        llist2.push(6); 
        llist2.push(4); 
        System.out.println("List1");
        llist1.printList(llist1.head);
        System.out.println("List2");
        llist2.printList(llist2.head);

    }
}