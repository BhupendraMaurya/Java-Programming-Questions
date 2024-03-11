import java.util.*;
public class Iteration_On_HashSets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Bhupendra");
        set.add("Raja");
        set.add("uuuu");

        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String name : set){
            System.out.println(name);
        }
    }
}
