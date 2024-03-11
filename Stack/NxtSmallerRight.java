import java.util.*;
public class NxtSmallerRight {
    public static void main(String args[]){
        int arr[] = {1,5,4,8,3};
        Stack<Integer> s = new Stack<>();
        int nxtsmaller[] = new int[arr.length];

        for(int i = arr.length-1; i>=0 ; i--){
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

        for(int  i=0; i<nxtsmaller.length; i++){
            System.out.print(nxtsmaller[i]+ " ");
        }
        System.out.println();
    }
}
