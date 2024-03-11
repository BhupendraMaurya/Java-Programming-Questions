import java.util.*;
public class BubbleSort {
    public static void bubble(int arr[], int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int sqroot(int n){
        int si = 1;
        int ei = n;
        int ans = 1;
        while(si<ei){
            int mid = (si+ei)/2;

            if(mid * mid == n){
                ans = mid;
            }

            else if(mid * mid < n){
                ans = mid;
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return ans;
    }

    public static int secLargest(int arr[], int n){
        int lar = arr[0];
        int sec = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                sec = lar;
                lar = arr[i];
            }   else if(arr[i]>sec && arr[i]<lar){
                sec = arr[i];
            }
        }
        return sec;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        int n = arr.length;
        bubble(arr, n);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number:" );200000000
         
        // int n = sc.nextInt();
        System.out.println(secLargest(arr, n));
    }
}
