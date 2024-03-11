import java.util.*;
public class Trapped_Rain_Water{
    public static int trappedwater(int height[]){
        int n=height.length;
        //calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary array
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int trappedrainwater=0;

        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedrainwater += waterlevel - height[i];
        }
        return trappedrainwater;
    }
    public static void main(String args[]){
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedwater(height));

    }
}