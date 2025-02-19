// https://www.geeksforgeeks.org/problems/floor-in-bst/1

public class Floor_IN_BST {
    
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    // following the property of BSt, we will just try to find the max value which is
    // smaller than or equal to given value(x) and among all the small values,maximum of them would be our answer.
    
    static int floorUtil(Node root, int x, int ans[]){
        if(root == null){
            return -1;
        }
        
        // if current node data is <= given value(x), then we are very sure that 
        // it could be our answer, but we are trying to find the bigger value than this.
        // bcz we want maximum value.
        
        if(root.data <= x){
            ans[0] = root.data;
            floorUtil(root.right, x, ans);
        }
        
        // if current node data > x, then it cant be our answer, so try to find the smaller value than this
        // so go on left side.
        else{
            floorUtil(root.left, x, ans);
        }
        
        return ans[0];
    }
    public static int floor(Node root, int x) {
        // Code here
        if(root == null){
            return -1;
        }
        
        int ans[] = new int[1];
        ans[0] = -1;
        
        floorUtil(root, x, ans);
        
        return ans[0];
    }
}
