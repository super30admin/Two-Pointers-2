// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n) since we are iterating through the array
//Space Complexity: O(1) since we are not taking any extra space 

    public int removeDuplicates(int[] nums) {
        
        int s = 1;
        int f = 1;
        int count = 1;
        
        // s pointer to collect the elements that are not repeated more than twice
        // while f pointer iterates through the entire array
        while(f < nums.length)
        {
            if(nums[f] == nums[f-1]){
                count++;
            }
            else{
                count = 1; // new element is found
            }
            
            //Until the count reaches the number of repeated elements allowed (in this case 2), we keep replacing 
            if(count <= 2){
                nums[s] = nums[f]; 
                s++;    
            }   
            
            f++;
        }
        
        return s;
  }