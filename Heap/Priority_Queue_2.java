// Priority Queuye for objects
import java.util.PriorityQueue;
public class Priority_Queue_2 {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("bhu", 4));
        pq.add(new Student("nam", 1));
        pq.add(new Student("ram", 2));
        pq.add(new Student("dhar", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
