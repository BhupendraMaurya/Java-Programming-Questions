
// https://leetcode.com/problems/insert-into-a-binary-search-tree/solutions/5615544/recursive-approach-beats-100-00/
public class Insert_Into_Binary_Search_tree {
    
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    // we are simply checking the node's value and according to that we are creating node and adding it to
    // desired place.

    void insertIntoBSTUtil(TreeNode root, int ans){
        if(root == null){
            return;
        }

        // if root's value is less than inserted node value, and root's right is null, then create a node and make it root's right.
        if(root.val < ans && root.right == null){
            TreeNode newNode = new TreeNode(ans);
            root.right = newNode;
            return;
        }

        // if root's value is > inserted value(ans), and root'left is null, then create a node and make it root's left.
        if(root.val > ans && root.left == null){
            TreeNode newNode = new TreeNode(ans);
            root.left = newNode;
            return;
        }

        // if left and right childs are not null, then check and recursively, go to respective direction

        // if root's value is < ans, then go to right, according to property of BST;
        if(root.val < ans){
            insertIntoBSTUtil(root.right, ans);
        }

        // else go to left side.
        else{
            insertIntoBSTUtil(root.left, ans);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            // if root is null, but there is val, so create a node, and make it root and return it.
            // and if root is null, then no need to comparison.
            TreeNode newNode = new TreeNode(val);
            root = newNode;
            return root;
        }
        insertIntoBSTUtil(root, val);

        return root;

    }

    // Short form of above code : 
    public void createBST(TreeNode root,int val){
        
        if(root.val == val){
            return;
        }else if(root.val < val){
            if(root.right != null){
                createBST(root.right,val);
            }else{
                root.right = new TreeNode(val);
                return;
            }
        }else{
            if(root.left != null){
                createBST(root.left,val);
            }else{
                root.left = new TreeNode(val);
                return;
            }
        }
    }
    public TreeNode insertIntoBST2(TreeNode root, int val) {
        if(root == null)return new TreeNode(val);
        createBST(root,val);
        return root;
    }
}
