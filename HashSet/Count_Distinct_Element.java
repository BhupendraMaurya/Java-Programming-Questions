import java.util.*;
public class Count_Distinct_Element {
    public static void main(String[] args) {
        int arr[] = {1,4,2,1,7,5,2,4,5};

        //HashSet<Integer> hs = new HashSet<>();
        // first approach
        // int count = 0;
        // for(Integer a : arr){
        //     if(hs.add(a)){
        //         count++;
        //     }
        // }
        // System.out.println("Distinct element : " +hs);
        // System.out.println(count);


        // second approach
        // for(int i=0;i<arr.length;i++){
        //     hs.add(arr[i]);
        // }
        // System.out.println("Distinct element : "+ hs);
        // System.out.println(hs.size());


        // third approach;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) +1);

            }
            else{
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
        System.out.println(hm.size());

        
    }
}
