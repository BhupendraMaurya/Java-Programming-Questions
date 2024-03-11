// Check if given strings are rotations of each other or not
import java.util.*;
public class Sixty_Eight{

    public static boolean areRotations(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        for(int i=0;i<str1.length();i++){
            q1.add(str1.charAt(i));
        }

        for(int i=0;i<str2.length();i++){
            q2.add(str2.charAt(i));
        }

        int i=str2.length();
        while(i>0){
            i--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if(q1.equals(q2)){
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDB";

        System.out.println(areRotations(str1, str2));
    }
}