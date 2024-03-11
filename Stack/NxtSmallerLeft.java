import java.util.*;
public class NxtSmallerLeft {
    public static void main(String args[]){
        int arr[] = {1,5,4,8,3};
        Stack<Integer> s = new Stack<>();
        int nxtsmaller[] = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nxtsmaller[i] = -1;
            }
            else{
                nxtsmaller[i] = arr[s.peek()];
            }
            s.push(i);
        }
        System.out.println("Next smaller element on left side is: ");

        for(int i=0; i<nxtsmaller.length; i++){
            System.out.print(nxtsmaller[i]+" ");
        }
        System.out.println();
    }
}
