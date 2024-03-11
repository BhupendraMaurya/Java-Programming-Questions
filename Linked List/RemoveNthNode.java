public class RemoveNthNode{
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthNodeFromEnd(int n){
       
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head =  head.next;
            return;
        }

        int i=1;
        int idxToFind = sz-n;
        Node prev = head;
        while(i < idxToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String args[]){
        RemoveNthNode remove = new RemoveNthNode();
        remove.addFirst(1);
        remove.addFirst(4);
        remove.addFirst(3);
        remove.addLast(5);
        remove.addLast(9);
        remove.addLast(7);
        remove.print();
        remove.deleteNthNodeFromEnd(4);
        remove.print();
    }
}