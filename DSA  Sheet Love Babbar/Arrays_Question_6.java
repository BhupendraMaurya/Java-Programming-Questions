// Union of two arrays

public class Arrays_Question_6 {

    // ❌ Not working : Some problem in code ❌
    // public static void union(int arr[], int arr2[]){ //applicable in any array , but with worst time complexity
    //     int a = arr.length;
    //     int b = arr2.length;
    //     int c = 0;
    //     int i=0,j=0;

    //     for( i=0;i< a;i++){
    //         for(j=0;j<b;j++){
    //             if(arr[i] == arr[j]){
    //                 System.out.println(arr[i]+" ");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     int d = ( a+ b ) - c;
    //     System.out.println(d);
    // }

    // Approach 2: applicable only in sorted array:
    public static void union2(int arr[], int arr2[]){ // appicable only for sorted array 
        int a = arr.length;
        int b = arr2.length;
        int i=0, j=0;
        while (i<a && j<b){
            if(arr[i] < arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else if(arr[i] > arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }
        while(i<a){
            System.out.print(arr[i]+" ");
            i++;
        }
        while(j<b){
            System.out.print(arr2[j]+ " ");
            j++;
        }
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,3};
        //union(arr, arr2);
        union2(arr, arr2);

    }
}
