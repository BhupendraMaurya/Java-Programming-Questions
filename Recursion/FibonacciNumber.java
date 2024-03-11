public class FibonacciNumber{
    public static int Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        
        }
        int Fnm1 = Fibo(n-1);
        int Fnm2 = Fibo(n-2);
        int Fn = Fnm1 + Fnm2;
        return Fn;
    }
    public static void main(String args[]){
        int n=15;
        System.out.println(Fibo(n));
    }
}