/*
time complexity: O(n), where is the number of elements as we traversing the array only once using 2 pointers
space complexity : O(1)


*/
class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        
        
        
        int count = 1;
        int k = 2;
                       
        int slow = 1;
        int fast = 1;
            while(fast < nums.length)
            {           
                 if(nums[fast] == nums[fast-1]){
                     count++;
                                         
                 }
                else {
                    count = 1;
                }
                    
                
                if(count <= k){
                          nums[slow] = nums[fast];
                          slow++;                         
                     }
                
                fast++;
            }
                
            
        
        return slow;
        
    }
}