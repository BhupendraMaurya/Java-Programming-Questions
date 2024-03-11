//  ❌ Not working ❌ // 
public class Is_Valid_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    // fucntion to validate BST
    public static boolean isValid(Node root){
        if(root == null){
            return false;
        }
        
        if(root.data < root.right.data){
            return isValid(root.right);
        }
        else if(root.data > root.left.data){
            return isValid(root.left);
        }
        // else{
        //     return false;
        // }
        // boolean leftIsValid = isValid(root.left);
        // boolean rightIsValid = isValid(root.right);
        // return true;
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        System.out.println(isValid(root));
    }
}
