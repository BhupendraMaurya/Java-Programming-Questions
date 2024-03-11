//check for a string if it is pallindrome or not
import java.util.*;
public class IsPalindrome{
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){//for not  A palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="bhupendra";
        System.out.println(palindrome(str));
    }
}//tc for this question is O(n).
