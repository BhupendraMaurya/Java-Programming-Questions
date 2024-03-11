import java.util.*;
public class Max_Length_Chain_Of_Pairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));// Sorting 2D array with lambda function

        int chainLength = 1;
        int chainEnd = pairs[0][1];//last selected pair's end

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length chain of pairs: "+chainLength);
    }
} //TC = O(nlogn): ncz we are using one loop and also sorting array so tcwill be O(nlogn);
