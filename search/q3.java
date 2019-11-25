class Solution{
    public static boolean checkIfPairExists(int[] array,int sum){
        // Function to find if pair exists in sorted and rotated array
        int index;// This is a index which will serve as a pivot element 
        int n=array.length;
        for (index=0;index<n-1;index++){
            if (array[index]>array[index+1]){
                break;
            }
        }
        int low=(index+1)%n;
        int high=index;
        while(low!=high){
            if (array[low]+array[high]==sum)
                return true;
            if (array[low]+array[high] < sum){
                low=(low+1)%n;
            }
            else{
                high=(n+index-1)%n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int array[]={11, 15, 6, 8, 9, 10};
        int sum=16;
        System.out.println(checkIfPairExists(array,sum));
    }
}