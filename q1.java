import java.util.Arrays;

class Solution{
    public static boolean checkIfPair(int[] array, int sum){
        //Using the simple method
        //First sort the array and then check if pair from low and high comes in range
        // Sort - O(nlogn)
        // To find pair - O(n)
        // Complexity - O(nlogn)+O(n)
        Arrays.sort(array);
        int arrayLength=array.length;
        int low=0;
        int high=arrayLength-1;
        while(low<high){
            if (array[low]+array[high] == sum){
                return true;
            }
            else if (array[low]+array[high] < sum){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] array={2,1,5,6,3,9};
        int sum=7;
        System.out.println(checkIfPair(array,sum));
    }
}