import java.util.*;
public class LinkedHash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // Insertion order is same
        lhs.add(5);
        lhs.add(2);
        lhs.add(3);
        lhs.add(1);
        System.out.println(lhs);
    }
}
