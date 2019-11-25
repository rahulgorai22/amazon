import java.util.HashMap;

class solution{
    public static boolean findSubArray(int[] array,int n){
        HashMap<Integer,Integer> cumulativeSums=new HashMap<Integer,Integer>();
        int currentSum=0;
        for (int i=0;i<n;i++){
            currentSum+=array[i];
            // Condition 1 - To check if currentSum is equal to 0
            // Condition 2 - If any element in the array is 0
            // Condition 3 - if currentSum is already present in the Hashmap

            // Hashmap - [(3,0),(4,1),(12,2),(3,3),(10,4)] - Since key 3 repeates that means the sub array between k+1 and i has sum 0, k being the first occurence of 3
            if (currentSum==0 || array[i]==0 || cumulativeSums.get(currentSum)!=null){
                return true;
            }
            cumulativeSums.put(currentSum,i);
        }
        return false;
    }
    public static void main(String[] args) {
        int array[]= {3,1,8,-9,7};
        int n=array.length;
        System.out.println(findSubArray(array,n));;
    }
}