import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(12);

        System.out.println(list);
        Collections.sort(list);//for ascending order
        System.out.println(list);

        //for descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}