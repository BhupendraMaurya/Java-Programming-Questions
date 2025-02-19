// https://leetcode.com/problems/balance-a-binary-search-tree/description/

import java.util.*;
public class Balance_A_BST {
    

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    // 1. Inorder traversal to get sorted sequence and then create a balanced BST from it.
    // Logic: First, perform an inorder traversal to obtain a sorted sequence of the tree's elements.
    // Then, construct a balanced BST by recursively choosing the middle element of the sorted list as the root.

    void inorder(TreeNode root, ArrayList<Integer> list) {
        // Base case: If the current node is null, return to the previous call.
        if (root == null) {
            return;
        }

        // Recursively traverse the left subtree.
        inorder(root.left, list);

        // Add the value of the current node to the list.
        list.add(root.val);

        // Recursively traverse the right subtree.
        inorder(root.right, list);
    }

    TreeNode balancedBST(ArrayList<Integer> list, int si, int ei) {
        // Base case: If the start index exceeds the end index, return null (no subtree to form).
        if (si > ei) {
            return null;
        }

        // Find the middle index to select the root node.
        int mid = (si + ei) / 2;

        // Create the root node with the middle element.
        TreeNode root = new TreeNode(list.get(mid));

        // Recursively create the left subtree from the left half of the list.
        root.left = balancedBST(list, si, mid - 1);

        // Recursively create the right subtree from the right half of the list.
        root.right = balancedBST(list, mid + 1, ei);

        // Return the root of the newly created subtree.
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        // Perform an inorder traversal to get the sorted sequence of node values.
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        // Convert the sorted list into a balanced BST and return the root.
        return balancedBST(list, 0, list.size() - 1);
    }

}
