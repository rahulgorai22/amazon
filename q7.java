import java.util.HashMap;

class solution{
    public static void printSubArray(int[] array,int startIndex,int endIndex){
        for (int i=startIndex;i<=endIndex;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
    }
    public static void findSubArray(int[] array,int n){
        HashMap<Integer,Integer> cumulativeSums=new HashMap<Integer,Integer>();
        int currentSum=0;
        for (int i=0;i<n;i++){
            currentSum+=array[i];
            // Condition 1 - To check if currentSum is equal to 0
            // Condition 2 - If any element in the array is 0
            // Condition 3 - if currentSum is already present in the Hashmap

            // Hashmap - [(3,0),(4,1),(12,2),(3,3),(10,4)] - Since key 3 repeates that means the sub array between k+1 and i has sum 0, k being the first occurence of 3
            if (currentSum==0 || array[i]==0 || cumulativeSums.get(currentSum)!=null){
                int startIndex=cumulativeSums.get(currentSum);
                int endIndex=i;
                printSubArray(array,startIndex+1,endIndex);
            }
            cumulativeSums.put(currentSum,i);
        }
    }
    public static void main(String[] args) {
        int array[]= {3,1,8,-9,7,5,7,-3,-4};
        int n=array.length;
        findSubArray(array,n);
    }
}