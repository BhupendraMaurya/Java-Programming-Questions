import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort2 {
    public static void main(String args[]){
        Integer arr[] = {4,1,5,0,99,3,2};
        Arrays.sort(arr,2,3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
