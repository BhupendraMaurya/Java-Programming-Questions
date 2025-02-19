// https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

public class Ceil_In_BST {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    
    // Function to return the ceil of given number in BST.
    int ceil(Node root, int k, int a[]){
        if(root == null){
            return -1;
        }
        
        // following the property of BST, if value of root is >= k, then 
        // take it as your answer, and go in left side, as we are searching the data which is >= given key,
        // among all the data which are >= key, smaller one would be our answer.

        //which is just >= k, 

        // if root.data >=k, then it could be our answer so storing it, and searching for more smaller than this.
        if(root.data >= k){
            a[0] = root.data;
            ceil(root.left, k, a);
        }
        else{
            // going in right side.
            ceil(root.right, k, a);
        }
        // since this function return type is int so returning a[0], but it not required to return it here
        
        return a[0];
    }
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        
        int a[] = new int[1];
        a[0] = -1;
        ceil(root, key, a);
        
        return a[0];
    }
}
