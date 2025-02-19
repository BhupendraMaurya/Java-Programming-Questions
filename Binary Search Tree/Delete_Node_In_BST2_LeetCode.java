 // https://leetcode.com/problems/delete-node-in-a-bst/description/

// ❌Two Steps : 1. first find the node which is to be deleted.
// 2. Delete according to its child.
// a. If zero child. then simply return null to its parent
// b. if having 1 child(left or right), then delete current node and return its child to its parent
// c. Else, find IS, and delete and update it. ❌
public class Delete_Node_In_BST2_LeetCode {
    
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

        // Finding the in-order successor (IS) of the given root: The IS is the leftmost leaf node in the right subtree of the current node.
    public TreeNode findIS_Successor(TreeNode root) {
        // No need to check for null, as it is already handled in the deleteUtil function.
        while (root.left != null) {
            root = root.left; // Keep moving left to reach the leftmost node.
        }
        // This is the leftmost leaf node in the right subtree of the original node.
        // It might have a right child, but it will never have a left child,
        // because it is the leftmost node in this subtree.
        return root;
    }
    
    public TreeNode deleteNodeUtil(TreeNode root, int key){
        if(root == null){
            return root;
        }
        // if root's value is greater than key, then call go in left child and delete desired child
        // then return and make it root's left,
       if(root.val > key){
        root.left = deleteNodeUtil(root.left, key);
       }

        // calling the right child and after deleting make the returning node as root's right
       else if(root.val < key){
        root.right = deleteNodeUtil(root.right, key);
       }

       else if(root.val == key){
        // case 1: if both the childs are null. then simply return null to its parent, and it would be deleted.
        
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2: if anyone child is null. 
            if(root.left == null){
                return root.right;
            }

            else if(root.right == null){
                return root.left;
            }

            // case 3: if both child are not null;
            // so find the node which is about to delete.(that means find Inorder Successor)

            // IS Means leftMost node in right subtree
            TreeNode IS = findIS_Successor(root.right);
            root.val = IS.val;
            root.right = deleteNodeUtil(root.right, IS.val);


        }
        else{// if key does not exist in given BST, then return root;
            return root;
        }

        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
       
        

        return deleteNodeUtil(root, key);
        
    }
}
