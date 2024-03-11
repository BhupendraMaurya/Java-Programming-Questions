import java.util.Scanner;

public class Reversed_Pyramid_Star_Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            for(int i=0;i< n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=n;k>i;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
