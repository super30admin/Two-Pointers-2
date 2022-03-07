/*
    Time Complexity : O(nlogn)
    Space Complexity : O(n)
*/
class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int count;
        
        Pair(int ele, int count){
            this.ele = ele;
            this.count = count;
        }
        
        @Override
        public int compareTo(Pair other){
            return this.ele - other.ele;
        }
    }
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int val : nums){
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
                
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        ArrayList<Integer> keyset = new ArrayList<>(freq.keySet());
        
        for(int key : keyset){
            pq.add(new Pair(key, freq.get(key)));
        }
        
        
        int index = 0;
        int ans = 0;
        while(pq.size() > 0){
            Pair rp = pq.remove();
            
            if(rp.count > 2){
                nums[index] = rp.ele;
                index++;
                
                nums[index] = rp.ele;
                index++;
                
                ans = ans + 2;
            }else{
                int until = rp.count;
                int counter = 1;
                while(counter <= until){
                    nums[index] = rp.ele;
                    index++;
                    counter++;
                    ans++;
                }
            }
        }
        
        return ans;
        
    }
}
