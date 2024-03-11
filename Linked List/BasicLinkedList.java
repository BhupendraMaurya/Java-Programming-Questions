public class BasicLinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1 - to create a node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 - new node's next = head
        newNode.next = head;

        // step 3- head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step 1- to create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2->tail's next = newnode
        tail.next = newNode;

        //step 3- tail = newnode
        tail = newNode;

    }

    public void print(){ // O(n)
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removefirst(){
        if(size == 0 ){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        size--;
        return val;
    }

    public static void main(String args[]){
        BasicLinkedList ll = new BasicLinkedList();
        
        ll.addFirst(2);
        
        ll.addFirst(1);
       
        ll.addLast(3);
        
        ll.addLast(4);

        ll.add(2,10);
        ll.print();

        //System.out.println(ll.size);

        ll.removefirst();
        ll.print();

        ll.removelast();
        ll.print();

        System.out.println("Size of ll is: " + ll.size);
    }
}