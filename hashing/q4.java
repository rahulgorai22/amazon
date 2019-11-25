import java.util.HashMap;

class Solution{
    public static void printPairs(int[] array1, int[] array2, int sum){
        // Rahul Gorai
        // Using Hashmaps
        // Complexity O(max(length(array1),length(array2)))
        // Space complexity O(N)
        HashMap<Integer,Integer> diffs=new HashMap<Integer,Integer>();
        for (int i=0;i<array1.length;i++){
            diffs.put(array1[i],0);
        }
        for (int j=0;j<array2.length;j++){
            if(diffs.containsKey(sum-array2[j])){
                System.out.println(sum-array2[j]+" "+array2[j]);
            }
        }
    }
    public static void main(String[] args){
        int[] array1={-1, -2, 4, -6, 5, 7};
        int[] array2= {6, 3, 4, 0};
        int sum=8;
        printPairs(array1,array2,sum);
        
    }
}