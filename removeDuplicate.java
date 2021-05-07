// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class removeDuplicate {

    public int removeDuplicates(int[] nums) {
        
        if(nums==null || nums.length==0)
            return 0;
        
        int counter=1; int j=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]){
                counter++;
            }else{
                counter=1;
            }
            
            if(counter<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        
        return j;
    }
    
}
