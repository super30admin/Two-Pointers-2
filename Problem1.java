
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//logic is to take count , slow and fast ptrs and move fast ptrs until unique and replace the slow with fast  
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        //slow ptr
        int j=0;
        //i is fast and it is always ncrementing
        for(int i=0;i<nums.length;i++){
            //if same elements we increment the count
            if(i>0 && nums[i]==nums[i-1]){
                count++;
            }
            // if not same we just make count as 1
            else{
                 count=1;
            }
            // if count is less than or equal to 2 then slow is at same element and j is at unique element and then we can replace and increment slow as fast is automatically incrementing in for loop
            if(count <= 2){
                nums[j]=nums[i];
                j++;
            }
        }
       return j; 
    }
}