// Next grreater element PRoblem using STACK;
import java.util.*;
public class NextGreaterElementRight2 {
    public static void main(String args[]){
        int arr[] = {4,6,1,8,2,5,3};
        Stack<Integer> s = new Stack<>();
        int nxtgreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nxtgreater[i] = -1;
            }
            else{
                nxtgreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        System.out.print("Next greater element on right side is: ");
        for(int i = 0; i<nxtgreater.length; i++){
            System.out.print(nxtgreater[i]+" ");
        }
        System.out.println();
    }
}
