
// Time Complexity : O(n) where 'n' is length of nums
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes


// increase the count at i = 0 and if prev element and current element are same
// maintain a ref pointer which get updated only till count<=2, means 2 same values are stored
//keep doing this till you reach the end of the array
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int ref = 0;
        int count = 0;
        for(int i= 0; i < nums.length ; i++){
            if(i ==0 || nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[ref] = nums[i];
                ref++;
            }
        }
        return ref;
        
    }
}
