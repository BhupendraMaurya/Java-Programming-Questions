public class AllOccurenceOfNumber{
    public static void allOccurence(int arr[], int key, int i){
        //base case
        if(i==arr.length){
            return;
        }
        //kaam
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        //call
        allOccurence(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,8,7,9,2,2,7,8,2,3,2,2};
        int key = 2;
        allOccurence(arr,key,0);

    }
}