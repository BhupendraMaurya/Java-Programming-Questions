import java.util.*;
public class Basic_Operations{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(null);
        System.out.println(set);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(2));
        set.clear();
        System.out.println(set);
    }
}