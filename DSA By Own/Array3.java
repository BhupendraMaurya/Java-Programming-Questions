// Find the only repetitive element between 1 to N-1
import java.util.*;
public class Array3 {
    // static void repetitiveElement(int a[],int n){ 
    //     Arrays.sort(a);
    //     for(int i=0;i<n;i++){
    //         if(a[i] == a[i+1]){
    //             System.out.println("Element fount at: "+i+" ANd element is :"+a[i]);
    //             return ;
    //         }
    //     }
    //     System.out.println("Not found");
        
    // }

    // static int repetitiveElement(int a[], int n){ // TC = O(n^2)
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if( a[i] == a[j]){
    //                 return a[i];
    //             }
    //         }
    //     }
    //     return -1;
    // }

    static int repetitiveElement(int a[], int n){
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i] != i+1){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,3,3,3,3,3,2,4};
        int n = a.length;
        System.out.println(repetitiveElement(a, n));
    }
}
