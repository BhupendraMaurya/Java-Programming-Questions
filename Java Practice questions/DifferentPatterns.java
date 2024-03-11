import java.util.*;
public class DifferentPatterns{

    //Program to print half pyramid using alphabets
    public static void Pyramid(int n){
        char alphabet='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alphabet);
            }
            System.out.println();
            alphabet++;
        }
    }
    //Inverted half pyramid using *
    public static void Pyramid2(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Inverted half pyramid using numbers
    public static void Pyramid3(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Program to print full pyramid using *
    public static void Pyramid4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted full pyramid using *
    public static void Pyramid5(int n){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Print Pascal's triangle
    public static void Pyramid6(int n){
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1||i==1){
                    System.out.print(c);
                }
                else{
                System.out.print(c + " ");
                c=c*(i-k+1)/k;
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        Pyramid6(n);
    }
}