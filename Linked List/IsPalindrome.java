public class IsPalindrome{
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

    public Node midNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            }
            return slow;
        }
    public boolean ispalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step-1 : find mid
        Node mid = midNode(head);
        // step-2: reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half's head
        Node left = head;

        // step - 3: compare left and right helf
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
        IsPalindrome palindrome = new IsPalindrome();
        palindrome.addFirst(6);
        palindrome.addFirst(4);
        palindrome.addFirst(2);
        palindrome.addLast(6);
        palindrome.addLast(4);
        palindrome.addLast(2);
        palindrome.print();

        System.out.println(palindrome.ispalindrome());
    }
}