// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

public class Convert_Sorted_Array_To_Balanced_BST {
    
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

// Convert a sorted array into a balanced Binary Search Tree (BST).
// The middle element of the current array segment is chosen as the root.
// The left half of the array becomes the left subtree, and the right half becomes the right subtree.
// This process is repeated recursively to create a balanced BST.

    TreeNode createBST(int nums[], int si, int ei) {
        // Base case: If the start index exceeds the end index, there are no elements to form a subtree.
        if (si > ei) {
            return null;
        }

        // Calculate the middle index to find the root of the current subtree.
        int mid = (si + ei) / 2;

        // Create a new node with the middle element as the root of the current subtree.
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively create the left subtree using the left half of the current array segment.
        root.left = createBST(nums, si, mid - 1);

        // Recursively create the right subtree using the right half of the current array segment.
        root.right = createBST(nums, mid + 1, ei);

        // Return the root of the subtree.
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        // If the array is empty, return null as there are no elements to form a BST.
        if (nums.length == 0) {
            return null;
        }

        // Define the start and end indices for the initial array segment.
        int si = 0;
        int ei = nums.length - 1;

        // Create and return the root of the balanced BST using the full array.
        return createBST(nums, si, ei);
    }

}
