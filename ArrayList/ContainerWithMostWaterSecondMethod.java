//Two pointer aproach
import java.util.ArrayList;
import java.util.*;

public class ContainerWithMostWaterSecondMethod {

    public static int storedwater(ArrayList<Integer> height){

        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int current_water = ht*width;
            maxwater = Math.max(maxwater,current_water);

            // update pointer
            if(height.get(lp) < height.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }


    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Total water stored is: " + storedwater(height));

    }
}