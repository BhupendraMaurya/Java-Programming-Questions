// https://www.geeksforgeeks.org/problems/inorder-successor-in-bst/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class InorderSuccessor {
    
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
     
    // we will take a node (value as -1); and after this we will follow BST property
    //current node's value is greater than x's value, then it means that it could be our answer. but we have to find the smaller than this.
    // so go to left side. Bcz we are finding the value which is greater than x value but less than other values

    
    Node findIS(Node root, Node x, Node newNode){
        if(root == null){
            return null;// return newNode; if you are returning this node on given function. otherwise return null;
        }
        if(root.data > x.data){
            newNode.data = root.data;
            return findIS(root.left, x, newNode);
        }
        else{
            return findIS(root.right, x, newNode);
        }
        
    }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
    {
    

        Node newNode = new Node(-1);
        
        // if you are returning newNode, then you can write (if root == null) in above function and return newNode
        // but if you are returning this function, then you have to return newNode in above function(if root == null, return neWNode);
        findIS(root, x, newNode);
        
        return newNode;
        
        
        
        
    }
}
