import java.util.*;
public class FractionalKnapsackProblem {
    public static void main(String[] args) {
        int value[] = {100,120,120};
        int weight[] = {20,40,30};
        int w = 80;


        // making 2D array
        double ratio[][] = new double[value.length][2];

        // 0th col --> idx;  1st col -> ratio

        for(int i=0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        // Sorting 2D array by Lambda function; Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;

        for(int i= ratio.length-1;i>=0;i--){
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){ // include full item
                finalValue += value[idx];
                capacity -= weight[idx];
            }
            else{// include fractional item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value: " +finalValue);
    }
}
