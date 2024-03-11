import java.util.*;

public class ClimbingStairs {

    // ❌ Recursion ❌
    public static int recursion(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return recursion(n-1) + recursion(n-2);
    }

    // ❌ Memoization ❌

    public static int memoization(int n, int a[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(a[n] != -1){
            return a[n];
        }

        a[n] = memoization(n-1, a) + memoization(n-2, a);
        return a[n];
    }

    //❌ Tabulation ❌

    public static int tabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    // ❌ Space Optimization ❌

    public static int SpaceOptimization(int n){
        int prev = 1;
        int prev2 = 1;

        for(int i=2;i<=n;i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;

        }

        return prev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        Arrays.fill(a, -1);

        System.out.println(recursion(n));
        System.out.println(memoization(n, a));
        System.out.println(tabulation(n));
        System.out.println(SpaceOptimization(n));

    }
}
