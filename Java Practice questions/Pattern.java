import java.util.Scanner;

// class Program{
//     public static void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

// }

//Right Triangle Star Pattern
// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//Left Triangle Star Pattern
// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=n-1;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// upper half diamond shape 
// class Program{
//     public void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<2*i-1;k++){
//                 System.out.print("*"); 
//             }
//             System.out.println();
//         }
//     }
// }




// lower half diamond

// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<2*(n-i)-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// diamond pattern
// class Program{
//     public void pattern(int n){
//      for(int i=1;i<=n;i++){
//         for(int j=n;j>i;j--){
//             System.out.print(" ");
//         }
//         for(int k=0;k<2*i-1;k++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }
//     }
//     public void lowerpattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<2*(n-i)-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }



// Downward Triangle Star Pattern
// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// Right Pascal's Triangle

// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>1;i--){
//             for(int j=0;j<i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }




// Left pascal's Triangle
// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=n-1;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=1;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<n-i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// class Program{
//     public void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 if(k==1 || i==n || k==2*i-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// Hollow Square Star Pattern

// class Program{
//     public void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||j==1||i==n||j==n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Hollow Square Pattern with Diagonal

// class Program{
//     public void pattern(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0||j==0||i==n-1||j==n-1||i==j||j==n-i-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// Hollow Mirrored Right Angled Triangle Star Pattern

// class Program{
//     public void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 if(k==1||k==i||i==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// Hollow Inverted Right Angled Triangle star Pattern

// class Program{
//     public void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 if(j==i||i==1||j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//  Hollow Pyramid Star Pattern


public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program p = new Program();
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Required pattern is:");
        p.pattern(n);
        //p.ppattern(n-1);
    }
}
