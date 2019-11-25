import java.util.HashSet;

class Solution{
    public static boolean checkIfPair(int[] array, int sum){
        // Rahul Gorai
        // O(n) solution using HashSet in Java
        HashSet<Integer> diffSet=new HashSet<Integer>();
        for (int index=0;index<array.length;index++)
        {
            int diff=sum-array[index];
            if (diffSet.contains(diff)){
                return true;
            }
            diffSet.add(array[index]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] array={2,1,5,6,3,9};
        int sum=7;
        System.out.println(checkIfPair(array,sum));
    }
}