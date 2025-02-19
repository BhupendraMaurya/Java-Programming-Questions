import java.util.*;
// https://leetcode.com/problems/binary-tree-paths/

// ❌Take the current node and go to left and right, and if it is leaf node then store in your answer and
// backtrack from it.❌

public class Binary_Tree_Paths_String {
    
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    void treePath(TreeNode root, StringBuilder ans, ArrayList<String> path) {
        // If the current node is null, stop recursion.
        if (root == null) {
            return;
        }
    
        // Save the current length of the StringBuilder before appending.
        int lengthBefore = ans.length();
    
        // If it's the first node in the path, add its value.
        // Otherwise, add "->" followed by the node's value.
        if (ans.isEmpty()) {
            ans.append(root.val);
        } else {
            ans.append("->").append(root.val);
        }
    
        // If the current node is a leaf (no children), add the current path to the list.
        if (root.left == null && root.right == null) {
            path.add(ans.toString());
        } else {
            // Recursively explore the left and right subtrees.
            treePath(root.left, ans, path);
            treePath(root.right, ans, path);
        }
    
        // Backtrack by removing the part of the path added in this call.
        ans.delete(lengthBefore, ans.length());
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> path = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
    
        treePath(root, ans, path);
    
        return path;
    }
    
}
