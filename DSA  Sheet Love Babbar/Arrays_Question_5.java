// Move all negative numbers to beginning and positive to end with constant extra space
import java.util.*;
public class Arrays_Question_5 {
    public static void moveNegative(int arr[]){//Brute force approach: compring with zero. put negative number in left and
        for(int i=0;i<arr.length;i++){            //positive number in right side
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i =0;i< arr.length;i++){
            if(arr[i] > 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    // Approach 2: Sort the array:
    public static void sortArray(int arr[]){
        Arrays.sort(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Approach 3: Two pointer approach:
    public static void moveNegative2(int arr[]){
        int a=0, b= arr.length-1, temp = 0;
        while(a<b){
            if(arr[a]<0){
                a++;
            }
            else if(arr[b] < 0){
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
            else if(arr[b] > 0){
                b--;
            }
        }
    }
    
   public static void main(String[] args) {
    int arr[] = {-12,11,-13,-5,6,-7,5,3,-6};
    //moveNegative(arr);
    //sortArray(arr);
    moveNegative2(arr);
    printArray(arr);
    
   } 
}
