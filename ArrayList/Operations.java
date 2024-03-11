import java.util.ArrayList;

public class Operations{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //to add an element in arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(33);
        list.add(4);
        System.out.println(list);

        //to access an element in a particular index
        list.get(3);
        System.out.println(" value at index 3 is :" + list.get(3));

        int index = list.get(4);
        System.out.println("value at index 4 is:" + index);

        //to remove an element at a particular index
        list.remove(3);
        System.out.println(list);

        //to remove all the elements
        //  list.clear();
        //  System.out.println(list);

        //set element at any index
        list.set(2,99);
        System.out.println(list);

        // to check any element exist in arraylist or not
        System.out.println(list.contains(10));
        System.out.println(list.contains(4));

        //add element at any index
        list.add(1,100);
        System.out.println(list);

        //to find size of arraylist
        System.out.println(list.size());


    }
}