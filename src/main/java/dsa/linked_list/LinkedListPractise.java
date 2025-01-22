package dsa.linked_list;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedListPractise {
    protected Node head;
    // Method to add a node at the end of the list
    public void add(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current= head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }

    // Method to display the linked lis
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node current =head;
            while(current!=null){
                System.out.print(current.data+ " -> ");
                current=current.next;
            }
            System.out.println("null");
        }
    }

    // Method to delete a node by value
    public void delete(int data){
       // 20 -> 10 -> 30
        Node current= head;
        Node previous=null;
        if(current==null){
            System.out.println("List is empty");
        }

        if(head.data==data){
            head=head.next;
            System.out.println("Node with data " + data + " deleted from the head.");
            return;
        }
        while(current!=null && current.data!=data){
            previous=current;
            current=current.next;
        }

        if(current==null){
            System.out.println(data+" not found in the list");
            return;
        }
        previous.next=current.next;
        System.out.println("Node with data " + data + " deleted.");
    }



    public static void main(String[] args) {
        LinkedListPractise list = new LinkedListPractise();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Linked list: ");
        list.display();
        list.delete(30);
        list.display();
    }
}
