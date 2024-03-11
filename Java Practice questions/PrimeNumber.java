import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        if(n<=1){
            System.out.println(" Not a prime number");
            return;
        }

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count>=1){
            System.out.println(n+ " is not a Prime number");
        }
        else{
            System.out.println(n+" Is a Prime Number");
        }
    }
}
