// https://www.geeksforgeeks.org/problems/binary-search-trees/1


// ❌ Simply checking that given traversal is sorted or not.❌
public class Is_BST_Representation {

    static boolean isBSTTraversal(int arr[]) {
        // According to Property of BST of, if given array is inorder traversal, then it woud be in Sorted Order.
       for(int i=0;i<arr.length-1;i++){
           // if at any moment if becomes unsorted, then it cant be BSt, so return false
           if(arr[i] >= arr[i+1]){
               return false;
            }
       }
       
       return true;
    }
}
