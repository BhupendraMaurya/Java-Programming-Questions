import java.util.Scanner;

public class Left_Triangle_Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0;i< n-1;i++){
            for(int j=0;j<= i;j++){
                System.out.print(" ");
            }
            for(int k=n-1;k>i;k--){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
