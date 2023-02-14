/*
 * Time Complexity : O(n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - We consider two pointers for this question. A fast pointer and a slow pointer. the fast pointer keeps incrementing by 1 but 
 * the slow pointer only increments for only the first 2 occurences of a unique element. This way we write the fast pointer value
 * into the slow pointer over the duplicates. 
 */

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[fast]==nums[fast-1]){
                count++;
            }else{
                count=0;
            }
            if(count<2){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}