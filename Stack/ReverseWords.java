import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello I am Bhupendra";

        Stack<String> st = new Stack<>();

        // str.split is defining that on what basis you are recognising your words. Here
        // If there will be space( " ") then we will know that yes it is word and put this in array 
        String arr[] = str.split(" ");

        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }

        while(!st.isEmpty()){
            System.out.print(st.pop() +" ");
        }
        System.out.println();

    }
}
