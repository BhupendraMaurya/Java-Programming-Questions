import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// ❌Three cases: 1. if root is > low and root < high, then go on both side
//2. if root < low, then go on right side
//3. else go to left side. ❌

public class Range_In_BST {
    

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    // recursively checking on left and right child using BST property
    static void range(Node root, int low, int high, ArrayList<Integer> list){
        
        if(root == null){
            return;
        }
        
        // if root's value is between low and high, then go for both the side
        if(root.data >= low && root.data <= high){
            range(root.left, low, high, list);
            list.add(root.data);
            range(root.right, low, high, list);
        }
        // if root.value is less than low, then go on right side only, 
        
        else if(root.data < low){
            range(root.right, low, high, list);
        }
        
        else{
            range(root.left, low, high, list);
        }
    }
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        ArrayList<Integer> list = new ArrayList<>();
        
        range(root, low, high, list);
        
        return list;
        
    }
}
