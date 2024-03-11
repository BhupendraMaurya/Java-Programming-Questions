import java.util.ArrayList;
public class SwapTwoNumber{
    public static void Swap(ArrayList<Integer> array, int idx1, int idx2){
        int temp = array.get(idx1);
        array.set(idx1, array.get(idx2));
        array.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(4);
        array.add(10);
        array.add(2);
        array.add(0);
        int idx1 = 1,idx2 = 3;
        System.out.println(array);
        Swap(array,idx1,idx2);
        System.out.println(array);
    }
}
