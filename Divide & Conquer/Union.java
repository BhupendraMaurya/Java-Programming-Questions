import java.util.*;
public class Union {

    public static int union(int a[], int n, int b[], int m){
        if(n == 0 && m == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        int i=0;
        while(i<n){
            set.add(a[i]);
            i++;
        }

        int j=0;
        while(j<m){
            set.add(b[j]);
            j++;
        }
        return set.size();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int n = a.length;
        int b[] = {1,2,3};
        int m = b.length;

        System.out.println(union(a,5,b,3));
    }
}
