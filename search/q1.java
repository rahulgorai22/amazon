class Solution{
    public static int maxElement(int[] array,int low, int high){
        // Condition when only one element
        if (array[low]==array[high])
            return array[low];
        // Condition when it is not roated at all
        if (array[low]<array[high])
            return array[high];
        // Find mid
        int mid=low+(high-low)/2;
        // Check if mid element is the max element
        if (mid<high && array[mid+1]<array[mid])
            return array[mid];
        // Check if mid-1 element is the max element
        if (mid<high && array[mid-1]<array[mid])
            return array[mid-1];
        // Check if to traverse left or right half
        if (array[low]<array[mid])
            return maxElement(array, low, mid-1);
        else
            return maxElement(array, mid+1, high);
    }
    public static void main(String[] args) {
        int array[]={3,4,5,1,2};
        // int array[]={1,2,3,4,5};
        
        int n=array.length;
        System.out.println(maxElement(array,0,n-1));
    }
}