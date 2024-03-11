import java.util.*;
public class Pattern {
    public static void print(int n){
        int k=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(k == 6){
                    k=0;
                }
                System.out.print(2*k + 1+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        print(n);


    }
}
