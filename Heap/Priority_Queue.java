// Priority Queue for int, string, character;
import java.util.*;
public class Priority_Queue{

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}