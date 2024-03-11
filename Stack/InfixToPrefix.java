import java.util.*;
public class InfixToPrefix {

    public static int precedence(char ch){
        switch(ch){
            case '+' : return 1;
            case '-' : return 1;
            case '*' : return 2;
            case '/' : return 2;
            case '^' : return 3;
        }

        return 0;
    }
    public static String infixToPrefix(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
    
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
    
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    sb.append(st.peek());
                    st.pop();
                }
                st.pop();
            } else if (ch == ')') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    st.push(ch);
                } else if (!st.isEmpty() && precedence(ch) >= precedence(st.peek())) {
                    st.push(ch);
                } else {
                    // if incoming operator precedence is less than st.top. precedence, then keep popping until lower precedence is got
                    while (!st.isEmpty() && precedence(ch) < precedence(st.peek())) {
                        sb.append(st.peek());
                        st.pop();
                    }
                    st.push(ch); // Push the incoming operator into the stack
                }
            }
        }
    
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
    
        return sb.reverse().toString();
    }
    
    public static void main(String args[]){
        String str = "x+y*z/w+u";
        String Expected_result = "++x/*yzwu";

        String output = infixToPrefix(str);
        System.out.println(output);
        System.out.println(Expected_result);

    }
}
