public class SumOfNNatural{
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = Sum(n-1);
        int Sn = n + Sum(n-1);
        return Sn;
    }
    public static void main(String args[]){
        int n=10;
        System.out.println(Sum(n));
    }
}