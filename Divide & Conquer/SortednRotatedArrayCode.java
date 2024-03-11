public class SortednRotatedArrayCode{

    public static int search(int arr[], int tar, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        // found at mid
        if(arr[mid] == tar){
            return mid;
        }

        // case 1: found at line 1
        if(arr[si]<=arr[mid]){
            // case a: left

            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);
            }
            else {//case b; right
                 return search(arr, tar, mid+1, ei);
            }
        }

        //found at line 2
        else{
            //case c: right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else {// case d: left
                return search(arr,tar,si,mid-1);
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {7,4,9,1,3,8,0};
        int target = -5;
        int midx = search(arr,target,0,arr.length-1);
        System.out.println(midx);

    }
}