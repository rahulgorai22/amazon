class Solution{
    public static void printPairs(int[] array1, int[] array2,int sum){
        // Rahul Gorai
        // O(n^2) Solution
        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array1[i]+array2[j]==sum){
                    System.out.println(array1[i]+" "+array2[j]);
                }
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