// Search an element in a Linked List (Iterative Approach): 

public class LinkedList1{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    

    void addFirst(int data){
        Node newNode = new Node(data);

        
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    boolean search(Node head, int x){ // searching using iterative search
        if(head == null){
            System.out.println("LL is empty");
            return false;
        }

        Node temp = head;
        while(temp != null){
            if(temp.data == x){
                return true;
            }

            temp = temp.next;
            
        }
        return false;
        
        
    }

    boolean search2(Node head, int x){ // recursive searching
        if(head== null){
            return false;
        }

        if(head.data == x){
            return true;
        }

        return search2(head.next, x);
    }

    int getCount(Node head){ // to find the length of linked list by iterative approach
        Node temp = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    int getCount2(Node head){ // recursive way
        if(head == null){
            return 0;
        }

        return 1 + getCount2(head.next);
        
    }

    void deleteFirst(){
        if(head == null){
            System.out.println("empty");
        }
        Node temp = head;
        head = head.next;
        temp.next = null;

    }

    Node deleteLast(){
        if(head == null){
            System.out.println("Empty");
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){

            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        // ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        //System.out.println(ll.search(head, 4));
        //System.out.println(ll.search2(head, 5));
        //System.out.println(ll.getCount2(head);
        // ll.deleteFirst();
        // ll.print();

        ll.deleteLast();
        ll.print();

    }
}