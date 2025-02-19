import java.util.ArrayList;
import java.util.List;

public class Merged_BST {
    
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    } 

    void inorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    
    // creating a BST using merged elements of given two BSTs
    Node createBST(ArrayList<Integer> arr,int si, int ei){
        if(si > ei){
            return null;
        }
        
        int mid = (si+ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);
        
        return root;
    }
    public List<Integer> merge(Node root1, Node root2) {
        // inorder sequence for root1,
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root1, list);
        
        // inorder sequence for root2
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root2, list2);
        
        // merging both inorder sequence and then will create a BST
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<list.size() && j < list2.size()){
            if(list.get(i) <= list2.get(j)){
                ans.add(list.get(i));
                i++;
            }
            else{
                ans.add(list2.get(j));
                j++;
            }
        }
        // if list has some elements
        while(i<list.size()){
            ans.add(list.get(i));
            i++;
        }
        
        // if list2 has some elements
        while(j<list2.size()){
            ans.add(list2.get(j));
            j++;
        }
        
        // if you want to return the node of merged tree, then just return this function call.
        createBST(ans, 0 , ans.size()-1);
        
        // returning the elements of final merged BST
        return ans;
        
    }
}
