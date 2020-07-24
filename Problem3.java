// Time Complexity :O(n)
//      n: number of elements
// Space Complexity :O(1)
//      in place
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Using three pointer approach
// previous -> previous element
// slow -> place where valid element should go
// fast -> for iterating
class Problem3 { 

    /** Duplicates appeared at most twice and return the new length. */
    public int removeDuplicates(int[] nums) {
        
        // base condition
        if(nums==null || nums.length==0)
            return 0;

        // flag for counting
        boolean flag=false;

        // 1st element
        int prev = 0;
        // next element
        int slow=1;
        int fast=1;
        
        // in range
        while(fast<nums.length){
            
            // check if duplicate
            if(nums[fast]== nums[prev]){
                //  second duplicate
                if(!flag){
                    // add
                   nums[slow++] = nums[fast];
                   flag=true;
                }
            // not duplicate
            }else{
                // 1st time
                flag=false;
                nums[slow++] = nums[fast];
                // update previous
                prev = fast;
            
            }
            // update fast pointer;
            fast++;
        }
        
        // return new length
        return slow;
    
    }
}