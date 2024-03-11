import java.util.*;
public class Reverse_String_Wordwise {
    public static void main(String args[]){

        String str = "My name is Bhupendra";
        Stack<String[]> st = new Stack<>();
        char[] ss = str.toCharArray();
        for(int i=0;i<ss.length;i++){
            st.add(ss[i]);
        }
        
        while(! st.isEmpty()){
            System.out.print(st.peek());
            st.remove();
        }
    }
}