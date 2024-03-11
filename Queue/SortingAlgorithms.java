import java.util.Scanner;

public class SortingAlgorithms{
    public static void main(String args[]){
        int arr[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();

            System.out.print("Enter the element of array: ");
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
        }
        insertionSort(arr);
        printArray(arr);
    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
//selection sort
        // for(int i=0;i<size-1;i++){
        //     int index = i;
        //     for(int j=i+1;j<size;j++){
        //         if(arr[j]<arr[index]){
        //             index = j;
        //         }
        //     }
        //     int temp = arr[index];
        //     arr[index] = arr[i];
        //     arr[i] = temp;
        // }
        
        
        //Bubble sort
        // for(int turns =0;turns<size-1;turns++){
        //     for(int j=0;j<size-1-turns;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

