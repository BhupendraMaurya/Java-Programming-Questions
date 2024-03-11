import java.util.Scanner;
public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        if(n<=1){
            System.out.println("Not a prime number");
            return;
        }

        for(int i=2; i<=n/2;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count>=1){
            System.out.println(" not Prime number");
        }
        else{
            System.out.println("a prime number");
        }
    }
}
