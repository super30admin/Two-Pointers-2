// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class remove{
    public int removeDuplicates(int[] nums) {
      
        if(nums.length<=2) return nums.length;
        
        int ans=2;
        
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[ans-2]){
                nums[ans]=nums[i];
                ans++;
            }
        }
        return ans; 
    }
}