import java.util.ArrayList;
public class MaximumInArraylist{
    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(4);
        array.add(10);
        array.add(2);
        array.add(0);
        System.out.println(array);

        int max = Integer.MIN_VALUE;

        for(int i=0;i<array.size(); i++){
            if(max < array.get(i)){
                max = array.get(i); 
            }
            //or max = Math.max(max,array.get(i));
        }
        System.out.print("Maximum element is:" +max);// TC O(n);
    }
}