package dsa.linked_list;


public class ReverseLinkedList extends LinkedListPractise {


    public void reverseLinkedList(){
        Node next=null;
        Node current=head;
        Node prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        System.out.println("hi");
    }

    public static void main(String[] args) {
        ReverseLinkedList lp=new ReverseLinkedList();
        lp.add(1);
        lp.add(2);
        lp.add(3);
        lp.add(4);
        lp.add(5);
        lp.display();
        lp.reverseLinkedList();
        lp.display();
    }
}
