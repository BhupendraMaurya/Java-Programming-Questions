public class FirstOccurence{
    public static int FirstOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcc(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {8,9,4,6,7,5,4,5,2,6,7};
        System.out.println(FirstOcc(arr,70,0));
    }
}