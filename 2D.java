import java.util.*;
public class 2D{
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //ffor output
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" YOur required matrix is: "+matrix[i][j]+" ");
            }
        }
        System.out.println();
    }
}