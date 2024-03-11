public class O_I_KnapSack{

    public static int o_1_KnapSack(int wt[], int val[], int W, int n){
        /*At ind==0, we are considering the first element, if the capacity of the knapsack is 
        greater than the weight of the first item, we return val[0] as answer. 
        We will achieve this using a for loop. 
            Next, we are done for the first row, so our ‘ind’ variable will move from 1 to n-1, 
            whereas our ‘cap’ variable will move from 0 to ‘W’. We will set the nested loops to traverse the dp array.
            Inside the nested loops we will apply the recursive logic to find the answer of the cell.
            When the nested loop execution has ended, we will return dp[n-1][W] as our answer.
            */
        int dp[][] = new int [n][W+1];

        //base case
        for(int i=wt[0]; i<=W;i++){
            dp[0][i] = val[0];
        }

        for(int i=1;i<n;i++){
            for(int cap = 0;cap <= W;cap++){
                int notTake = dp[i-1][cap];

                int take = Integer.MIN_VALUE;

                if(wt[i] <= cap){
                    take = val[i] + dp[i-1][cap - wt[i]];
                }

                dp[i][cap] = Math.max(take, notTake);
            }
        }

        print(dp);

        return dp[n-1][W];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int wt[] = {3,2,4};
        int val[] = {30,40,60};

        int W = 5;
        int n = wt.length;

        System.out.println("Required Answer is: " +o_1_KnapSack(wt, val, W, n));

    }
}