import java.util.*;
public class TwoTriangleInNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            // for first triangle numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // for spaces
            
            for(int j=1;j<=(2*n - 2*i);j++){
                System.out.print(" ");
            }

            // for second triangle
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();

        }
    }
}
