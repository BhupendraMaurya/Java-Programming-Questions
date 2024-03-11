import java.util.Stack;

public class Practice {
    public static String encode(String str){
        StringBuilder sb = new StringBuilder();
          Stack<Character> s = new Stack<>();
          for(int i = str.length() - 1; i >= 0; i--){
              s.push(str.charAt(i));
          }
          int count = 1;
          while(!s.isEmpty()){
             char c = s.pop();
             if(!s.isEmpty() && c == s.peek()){
                 count++;
             }else{
                 sb.append(c);
                 sb.append(count);
                 count = 1;
             }
          }
         return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbcdddaa";

        System.out.println(encode(str));
    }
}
