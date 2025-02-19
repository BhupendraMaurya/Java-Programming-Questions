// https://leetcode.com/problems/validate-binary-search-tree/description/

public class Is_Valid_BST2 {
   
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }
    
    boolean isValid(TreeNode root, TreeNode min, TreeNode max) {
        // Base case: If the current node is null, return true because an empty tree is valid.
        if (root == null) {
            return true;
        }
    
        // Check if the current node's value violates the BST property:
        // - It must be greater than the value of the min node (if min is not null).
        // - It must be less than the value of the max node (if max is not null).
        if (min != null && root.val <= min.val) {
            return false;  // The current node is not greater than the allowed minimum value.
        } else if (max != null && root.val >= max.val) {
            return false;  // The current node is not less than the allowed maximum value.
        }
    
        // Recursively check the left and right subtrees:
        // - For the left subtree, the current node becomes the new max.
        // - For the right subtree, the current node becomes the new min.
        // Both subtrees must be valid for the entire tree to be a valid BST.
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
    
    public boolean isValidBST(TreeNode root) {
        // Edge case: An empty tree is a valid BST.
        if (root == null) {
            return true;
        }
    
        // Start the recursion with no min or max constraints.
        return isValid(root, null, null);
    }
}
