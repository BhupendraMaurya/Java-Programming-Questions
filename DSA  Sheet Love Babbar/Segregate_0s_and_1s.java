// You are given an array of 0s and 1s in random order.
//Segregate 0s on left side and 1s on right side of the array
//[Basically you have to sort the array]. Traverse array only once. 

//Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
//Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

 

public class Segregate_0s_and_1s{ // we are using method of counting total zero and after that print total zero and then print all one.
    public static void segregate(int arr[]){ // Method 1 (Count 0s or 1s)
        int count = 0;
        for(int i=0;i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i=0;i< count;i++){
            arr[i] = 0;
        }
        for(int i=count; i<arr.length;i++){
            arr[i] = 1;
        }
    }

    public static void segregate2(int arr[]){//Method 2 (Use two indexes to traverse) 
        int left = 0;
        int right = 5;
        int temp =0;

        while(left<right){
            if(arr[left] == 0){
                left++;
            }
            else if(arr[right] == 1){
                right--;
            }
            else if(arr[right] == 0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
    public static void printArray(int arr[]){
        System.out.print("Sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,0,0};
        segregate2(arr);
        printArray(arr);
    }
}

