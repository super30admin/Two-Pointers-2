
public class Problem_1 {
	 public int removeDuplicates(int[] nums) {
	        if(nums.length == 0 || nums == null){
	            return 0;
	        }
	        
	        int slow = 0;
	        int fast = 1;
	        boolean flag = false;
	        
	        while(fast < nums.length){
	            
	            if(nums[slow] == nums[fast]){
	                if(!flag){
	                    flag = true;
	                    slow++;
	                    nums[slow] = nums[fast];
	                    fast++;
	                }else{
	                    
	                    while(fast <nums.length && nums[fast] == nums[fast-1]){
	                        fast++;
	                    }
	                }
	                
	            }else{
	                flag = false;
	                slow++;
	                nums[slow] = nums[fast];
	                fast++;
	            }
	        }
	        
	        return (++slow);
	        
	        
	        
	    }
}
