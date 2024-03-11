public class LastOccurence{
    public static int LastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        //look forward
        int isFound = LastOcc(arr,key,i+1);
        if(isFound != -1){
            return isFound;
        }
        //check withself
        if(arr[i]==key){
            return i;
        }
        return isFound;

    }
    public static void main(String args[]){
        int arr[] = {7,8,9,5,1,4,5,5};
        System.out.println(LastOcc(arr,5,0));

    }
}