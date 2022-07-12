//Time Complexity: O(n)
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem1 {

    public int removeDuplicates(int[] nums) {
        
        if(nums == null|| nums.length == 0)
            return -1;
        
        if(nums.length <= 2)
            return nums.length;
        
        int count  = 1;
        int j =1;
        
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] == nums[i-1])
                count++;
            
            else
                count = 1;
            
            if(count <=2 )
            {
                nums[j] = nums[i];
                j++;
            }
        }
       return j; 
    }
}
