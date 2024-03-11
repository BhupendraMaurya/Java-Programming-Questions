public class CountInversion{
    public static int getInvCount(int arr[]){
        int n = arr.length;
        int invcount = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    invcount++;
                }
            }
        }
        return invcount;
    }
    public static void main(String args[]){
        int arr[] ={1,0,3,4,5,6};
        System.out.println(" Count inversion for given array is: " +(getInvCount(arr)));

    }
}