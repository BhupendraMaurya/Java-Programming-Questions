import java.util.*;
public class Min_Sum_Absolute_Difference_Pairs {
    public static void main(String[] args) {
        int A[] = {2,1,3};
        int B[] = {3,2,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println(" Minimum absolute difference of pairs: "+minDiff);
    }
}
