//this problem is based on divide and conquer technique
public class MergeSortProblem{

    public static void print(int arr[]){
        System.out.print("Sorted Array is: ");
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {4,2,7,1,3};

        MergeSort(arr, 0, arr.length-1);
        print(arr);
    }
}