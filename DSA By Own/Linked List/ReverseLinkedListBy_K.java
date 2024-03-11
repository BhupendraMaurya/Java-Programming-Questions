// Reverse a Linked List in groups of given size 
public class ReverseLinkedListBy_K{
    Node head = null;
    static Node tail = null;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void addFirst (int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void print(){

        if(head == null){
            System.out.println("EMpty linked list");
            return;
        }

        Node temp  = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    Node reverse(Node head, int k){
        if(head == null){
            return null;
        }
        
        Node curr = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while(count < k && curr != null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
            count++;

        }
        if(next != null){
            head.next = reverse(next, k);
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedListBy_K rl = new ReverseLinkedListBy_K();
        rl.addFirst(9);
        rl.addFirst(8);
        rl.addFirst(7);
        rl.addFirst(6);
        rl.addFirst(5);
        rl.addFirst(4);
        rl.addFirst(3);
        rl.addFirst(2);
        rl.addFirst(1);
        rl.print();
        rl.head = rl.reverse(rl.head, 3);
        rl.print();
    }
}