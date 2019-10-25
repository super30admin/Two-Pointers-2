class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]))
            hm.put(nums[i],1);
            else hm.put(nums[i],hm.get(nums[i])+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])>=2)
            {  
                count=count+2;
               
            }
             else {
                 count =count+hm.get(nums[i]);
               
                 
                 }
        }
        int k=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
	
            if(entry.getValue()>=2)
            {
                nums[k]=entry.getKey();
                k++;          
                nums[k]=entry.getKey();
                k++;
            }
            else {nums[k]=entry.getKey();
                 k++;
                 }
		}
        
        
            return count;        
    }
}
//TC:O(n)
//SC:O(n)
//Does not get accepted on leetcode
/*Your input In place issue
[1,1,1,2,2,3]
Output
[1,1,2,2,3,3]
Expected
[1,1,2,2,3]
*/

