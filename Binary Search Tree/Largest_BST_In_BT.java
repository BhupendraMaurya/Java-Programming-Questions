

class Info {
    boolean isBST;
    int size;
    int min;
    int max;

    public Info(boolean isBST, int size, int min, int max) {
        this.isBST = isBST; // indicates if the current subtree is a BST
        this.size = size;   // size of the largest BST in the subtree
        this.min = min;     // minimum value in the subtree
        this.max = max;     // maximum value in the subtree
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class Largest_BST_In_BT {

    // Global variable to keep track of the size of the largest BST found
    public static int maxBST = 0;

    // Helper method to calculate the largest BST in the subtree rooted at 'root'
    static Info largestBST(Node root) {
        if (root == null) {
            // Base case: An empty subtree is a BST of size 0
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively get the information for the left and right subtrees
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // Calculate the size, min, and max values for the current subtree
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // Check if the current node forms a valid BST with its left and right subtrees
        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
            // Update the global maxBST if the current subtree is a valid BST
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        // If not a valid BST, return false but still pass the correct min and max
        return new Info(false, size, min, max);
    }

    // Main method to find the largest BST in the entire tree
    static int largestBst(Node root) {
        // Reset maxBST to ensure fresh calculation for each call
        maxBST = 0;

        // Start the recursive process to find the largest BST
        largestBST(root);

        // Return the size of the largest BST found
        return maxBST;
    }
}
