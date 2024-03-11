public class Arrays_Question_6_b {
    public static void intersection(int arr[], int arr2[]){ // for sorted and unsorted array
        int a = arr.length;
        int b = arr2.length;
        for(int i=0;i< a; i++){
            for(int j=0;j<b;j++){
                if(arr[i]==arr2[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    public static void intersection2(int arr[], int arr2[]){ // Applicable only for sorted array
        int i=0, j=0;
        int a = arr.length;
        int b = arr2.length;
        while(i<a && j<b){
            if(arr[i] < arr2[j]){
                i++;
            }
            else if(arr[i] > arr2[j]){
                j++;
            }
            else if(arr[i] == arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
            else{
                System.out.print("Array is not sorted or empty array set"); 
            }
        }
        System.out.print("Array is not sorted or empty array set");
        
    }
    public static void main(String[] args) {
        int arr[] = {4,1,5,2,3,7};
        int arr2[] = {1,2,3};
        // intersection(arr, arr2);
        intersection2(arr,arr2);

    }
}
