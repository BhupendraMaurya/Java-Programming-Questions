public class Delete_Node_In_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){// function to build a BST
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

    public static void inorder(Node root){// inorder traversal to print BST
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){ // function to search in BST
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static Node delete(Node root, int val){ // function to delete a node
        if(root.data < val){
            root.right = delete(root.right,val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // case - 1 : leaf node;
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2: one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3: both children

            Node IS  = findInorderSuccessor(root.right);

            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){ // function to find Inorder Successor
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        root = delete(root, 10);
        System.out.println();

        inorder(root);
        System.out.println();

    }
}
