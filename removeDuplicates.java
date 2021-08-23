class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length <= 2)
		   return nums.length;
    	
    	int i=0;
    	int k=0;
    	int res = 0;
    	
    	while(i<nums.length-2) {
    		if(nums[i]==nums[i+1] && nums[i]==nums[i+2]) {
    			i++;
    			res++;
    		}
    		else {
    			nums[k] = nums[i];
    			i++;
    			k++;
    		}    			
    		
    	}
    	
    	nums[k] = nums[i];
    	nums[k+1] = nums[i+1];
    	
    	
    	return nums.length - res;
        
    }
}