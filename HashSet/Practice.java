import java.util.*;
public class Practice {

    // public static void main(String[] args) { // Right down Mirror Star Pattern
    //     int n=5;
    //     for(int i=0;i<n;i++) {
    //     for(int j=0;j<i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=n;k>i;k--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     }
    // }

    // public static void main(String[] args) { // Downward Triangle Star Pattern
    //     int n=5;
    //     for(int i=0;i<n;i++){
    //         for(int j=n;j>i;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) { // Mirrored Right Triangle Star Program

        // Scanner sc =  new Scanner(System.in);
        // System.out.print("Enter number of rows: ");
        // int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
    // }
    

    // public static void main(String[] args) { // Pyramid Program
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.print("Enter number of rows: ");
    //     int n = sc.nextInt();

    //     for(int i=0;i<n;i++){
    //         for(int j=n-1;j>i;j--){
    //             System.out.print(" ");
    //         }
    //         for(int k=0;k<=i;k++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) { //Right Triangle Star Pattern
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.print("Enter number of rows: ");
    //     int n = sc.nextInt();

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) { 
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k= (2*n-2*i-1);k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
