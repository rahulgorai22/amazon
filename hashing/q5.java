class Solution{
    public static boolean findSubArray(int[] array,int n){
        int currentSum;
        for (int i=0;i<n-1;i++) {
            currentSum=array[i];
            System.out.println(currentSum);
            for (int j=i+1;j<n;j++){
                currentSum=currentSum+array[j];
                if (currentSum==0){
                    return true;
                }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int array[]= {3,1,8,-9,7};
        int n=array.length;
        System.out.println(findSubArray(array,n));;
    }
}