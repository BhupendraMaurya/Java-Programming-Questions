// Program to copy all elements of one array into another array
public class Array1{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}