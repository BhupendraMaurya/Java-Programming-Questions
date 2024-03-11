import java.util.*;
public class TwoDimensional{
    public static boolean search(int matrix[][],int key){
        int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println(" Found at cell: ( " +i+ "," +j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //ffor output
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(+matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}