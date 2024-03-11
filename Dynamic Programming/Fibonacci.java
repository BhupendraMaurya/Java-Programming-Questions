import java.util.*;

public class Fibonacci{
    // ❌ Using Recursion❌
    public static int fibnacci1(int n){
        if(n == 0 || n ==1){
            return n;
        }

        return fibnacci1(n-1) + fibnacci1(n-2);
    }
    

    // ❌ Using Memoization ❌

    public static int memoization(int n, int a[]){
        if(n == 0 || n ==1){
            return n;
        }

        if(a[n] != 0){
            return a[n];
        }

        a[n] = memoization(n-1, a) + memoization(n-2, a);

        return a[n];
    }
    
    // ❌ Using Tabulation ❌

    public static int tabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    
    // ❌ Using Space Optimization ❌
    public static int SpaceOptimization(int n){
        int prev2 = 0, prev = 1;

        for(int i=2;i<=n;i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a[] = new int[n+1];

        System.out.println(fibnacci1(n));
        System.out.println(memoization(n, a));
        System.out.println(tabulation(n));
        System.out.println(SpaceOptimization(n));
    }
}