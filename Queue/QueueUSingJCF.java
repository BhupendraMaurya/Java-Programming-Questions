import java.util.*;
public class QueueUSingJCF {
    public static void main(String args[]){

        //Queue<Integer> q = new LinkedList<>(); // here we can use LinkedList or ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();
        q.add(2344);
        q.add(23);
        q.add(4555);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
