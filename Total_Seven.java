import java.util.*;
public class Total_Seven{
    public static void print(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("total count of 7's is: " +count);
    }
    public static void main(String args[]){
        int arr[][]={{7,7,7},{7,7,7}};
        print(arr);
    }
}