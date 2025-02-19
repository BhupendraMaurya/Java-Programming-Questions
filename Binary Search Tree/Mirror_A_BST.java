// https://www.geeksforgeeks.org/problems/mirror-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


public class Mirror_A_BST {
    
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    
    // trying to solve the smaller problem by going to the leaf node.and keep faith in recursion that it will solve 
    // my bigger problem using this concept.
    
    void mirror(Node node) {
        if(node == null){
            return;
        }
        
        //calling left and right childs
        
        mirror(node.left);
        mirror(node.right);
        
        // swaping the left and right child node using third variable
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
