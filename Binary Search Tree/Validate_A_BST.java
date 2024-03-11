
public class Validate_A_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // function to build a BST
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    // fucntion to validate BST
    public static boolean isValid(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        
        if(min != null && root.data <= min.data){
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    // function to traverse the BST : i.e. inorder traversal

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.left.left = new Node(5);
        
        inorder(root);
        System.out.println(); 

        System.out.println(isValid(root, null, null));
    }
}
