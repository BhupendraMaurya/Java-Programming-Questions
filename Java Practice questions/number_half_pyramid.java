import java.util.*;
public class number_half_pyramid{
    public static void Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        Pyramid(n);
    }
}