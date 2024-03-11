public class Min_Distance_Between_Nodes {
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
    public static Node lca(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca(root.left,n1,n2);
        Node rightLCA = lca(root.right,n1,n2);

        if(rightLCA == null){
            return leftLCA;
        }
        if(leftLCA == null){
            return rightLCA;
        }
        if(leftLCA != null && rightLCA != null ){
            return root;
        }
        return root;
    }

    public static int lcaDist(Node root,int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right,n);
        
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist + 1;
        }
        else{
            return leftDist + 1;
        }

    }
    public static int minDistance(Node root,int n1,int n2){
        Node lca2 = lca(root,n1,n2);

        int dist1 = lcaDist(lca2,n1);
        int dist2 = lcaDist(lca2,n2);

        return dist1 + dist2;
    }
    public static void main(String args[]){
        /*
                    1
                   / \
                  2   3
                 /\   /\
                4  5  6 7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 7;
        System.out.println("Minimum distance between node n1 and n2 is : " +minDistance(root,n1,n2));
    }
}
