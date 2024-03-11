//not completed; means there is not satisfying answer
import java.util.ArrayList;
import java.util.*;

public class LonelyNumbersinArrayList{
    
    public static ArrayList<Integer> Lonely(ArrayList<Integer> list){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<list.size()-1; i++){
            if(list.get(i-1)+1 < list.get(i) && list.get(i) +1 < list.get(i+1)){
                nums.add(list.get(i));
            }
        }

        if(list.size() == 1){
            nums.add(list.get(0));
        }
        else if(list.size() > 1){
            if(list.get(0)+1 < list.get(1)){
                nums.add(list.get(0));
            }
            else if(list.get(list.size()-2) + 1 < list.get(list.size()-1)){
                nums.add(list.get(list.size()-1));
            }
        }
        return nums;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> nums = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Lonely(list));

    }
}