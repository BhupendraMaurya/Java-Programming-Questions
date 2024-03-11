public class Diameter_Of_A_Tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    public static int diameter(Node root){ // O(n^2)
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int lh = height(root.left);
        int rightDiam = diameter(root.right);
        int rh = height(root.right);
        
        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
    public static void main(String[] args) {
       /* 
                        1
                       / \
                      2   3
                     / \  / \
                     4  5 6  7
       */
      
       Node root = new Node(1);
       root.left = new Node(2);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right = new Node(3);
       root.right.left = new Node(6);
       root.right.right = new Node(7);

       System.out.println(diameter(root));
    }
}
