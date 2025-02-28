public class Print_In_Range {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // fucntion to insert values in BST
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){// Inorder traversal
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printRange(root.right,k1,k2);
        }
        else if(root.data >k2){
            printRange(root.left,k1,k2);
        }
        else{
            printRange(root.right,k1,k2);
        }
    }
    public static void main(String[] args) {
        int values[] = {9, 4, 18, 1, 6, 17, 19, 3, 5, 7};
        Node root = null;

        for(int i=0; i< values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        printRange(root,13,23);
    }
}
