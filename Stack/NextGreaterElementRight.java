// using Brute force approach:
public class NextGreaterElementRight {
    public static void main(String srgs[]){
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            nextGreater[i] = -1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    nextGreater[i] = arr[j];
                    break;
                }
            }
        }
        for(int i = 0; i<nextGreater.length; i++){
            System.out.println(nextGreater[i]+" ");
        }
    }
}
