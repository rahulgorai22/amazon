import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

class Solution{
    public static ArrayList mostFrequentElement(int[] array){
        // Insert the frequency of each element of the array in the Hashmap
        HashMap<Integer,Integer> frequency=new HashMap<Integer,Integer>();
        for (int i=0;i<array.length;i++){
            int key=array[i];
            if(frequency.containsKey(key)){
                int frequencyElement=frequency.get(key);
                frequencyElement++;
                frequency.put(key,frequencyElement);
            }
            else{
                frequency.put(key,1);
            }
        }
        // Check the most frequent element
        int max=0;
        for (Entry<Integer,Integer> values:frequency.entrySet()){
            if (max<values.getValue()){
                max=values.getValue();
            }
        }
        ArrayList res=new ArrayList<>();
        for(Entry<Integer,Integer> values:frequency.entrySet()){
            if (values.getValue()==max){
                res.add(values.getKey());
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int array[]={2,1,8,5,9,5,8,5,8};
        ArrayList out=new ArrayList<>();
        out=mostFrequentElement(array);
        for (int i=0;i<out.size();i++){
            System.out.println(out.get(i)+" ");
        }
    }
}