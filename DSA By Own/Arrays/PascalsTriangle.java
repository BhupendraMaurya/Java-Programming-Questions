import java.util.*;
public class PascalsTriangle{

    // Q1- print a value at a given position
    public static int permutation(int r){
        int d = 1;
        for(int i=1;i<r;i++){
            d *= i;
        }

        return d;
    }

    public static int permu(int a){
        int d = 1;

        for(int i=1;i<=a;i++){
            d *= i;
        }
        return d;
    }

    // better than previous one = TC -> O(r)
    public static int funcNcR(int n , int r){
        int res = 1;

        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }

        return res;
    }

    // Q2- Print all the numbers in any given row
    // since we know that in any row N there will be total N numbers
    //so run a loop till N and compute each value at every position
    
    public static void print(int n, int r){
        ArrayList<Integer> list = new ArrayList<>();
        int nn = n;
        int cc = r;
        for(int c=1; c<= n;c++){
            int val = funcNcR(nn, cc);
            list.add(val);
        }

        System.out.print(list);
    }
    public static void main(String args[]){
        int r = 6;
        int c = 3;

    //    int pnc = funcNcR(r-1, c-1);
    //    System.out.println(pnc);

          print(r, c);

    }
}