import java.util.*;
public class Fibonacci {

    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        for(int i=3;i<=n;i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
