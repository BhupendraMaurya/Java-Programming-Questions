import java.util.*;
public class PushAtBottom2 {

    public static void Bottom(Stack<Integer> s1,Stack<Integer> s2,Stack<Integer> s3, int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s3.push(data);
        while(!s2.isEmpty()){
            s3.push(s2.pop());
        }

        
    }
    public static void main(String args[]){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        Bottom(s1,s2,s3,6);

        while(!s3.isEmpty()){
            System.out.println(s3.pop());
        }
    }
}