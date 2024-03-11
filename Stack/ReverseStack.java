import java.util.*;
public class ReverseStack {
    

    public static void main(String args[]){
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Stack<Integer> ss = new Stack<>();
        while(!s.isEmpty()){
            ss.push(s.pop());
        }

        while(!ss.isEmpty()){
            s = ss;
            System.out.println(s.peek()); 
        }

    }
}
