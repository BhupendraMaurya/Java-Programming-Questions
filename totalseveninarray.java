import java.util.*;
public class totalseveninarray{
    public static int print(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[0].length-1;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][]={{4,7,8},{8,8,7}};
        print(arr);
    }
}