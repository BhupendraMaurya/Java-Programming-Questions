public class TilingProblem{
    public static int Tilingproblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = Tilingproblem(n-1);

        //horizontal choice
        int fnm2 = Tilingproblem(n-2);
        
        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(Tilingproblem(2));
    }
}