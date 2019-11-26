import java.util.LinkedHashMap;
import java.util.Map;

class Solution{
    public static class LRUCache{
        private Map<Integer,Integer> map;
        private int capacity;
        public LRUCache(int n){
            this.map=new LinkedHashMap<Integer,Integer>();
            this.capacity=n;
        }
        public int get(int x){
            int key=x;
            if (!map.containsKey(key)) return -1;
            int value=map.get(key);
            // This if condition is to mark this query
            if (map.size()>1){
                map.remove(key);
                map.put(key, value);
            }
            return value;
        }
        public void set(int key, int value){
            if(!map.containsKey(key)){
                if(map.size()==capacity){
                    // if the cache is full find the first entry in the Hashmap and remove it as it will be the least recently used. 
                    int firstKey=map.keySet().iterator().next();
                    map.remove(firstKey);
                }
                map.put(key, value);
            }
            else{
                map.remove(key);
                map.put(key, value);
            }
        }
        public void printCache(LRUCache cache){
            for (int key:cache.map.keySet()){
                System.out.println(key+"----"+cache.map.get(key));
            }
        }
    }
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(5); // Creating a LRU Cache of size 5
        cache.set(10, 20);
        cache.set(20, 30);
        cache.set(30, 40);
        cache.set(40, 50);
        cache.set(50, 60);
        cache.set(80, 290);
        cache.printCache(cache);
        cache.get(20);
        cache.printCache(cache);
    }
}