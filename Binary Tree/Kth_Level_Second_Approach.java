// ❌  question not solved  ❌
import java.util.*;
public class Kth_Level_Second_Approach {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelOrder(Node root,int level, int k){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        //level++;
        
        while(!q.isEmpty()){
            Node currNode = q.remove();
            // level++;
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(level == k){
                    System.out.print(currNode.data+" ");
                    return;
                }
                if(currNode.left != null){
                    q.add(currNode.left);
                    level++;
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                    level++;
                }
            }
        }
    }
    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 /\   /\
                4  5  6 7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k=3;
        levelOrder(root,1, k);
    }
}
