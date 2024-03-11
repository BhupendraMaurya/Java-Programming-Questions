public class LinearSearch{
    public static int linearsearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {7,1,8,4,9,2};
        int key = 2;
        System.out.println(linearsearch(arr, key));
    }
}