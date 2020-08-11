/* 80. Remove Duplicates from Sorted Array II
Time Complexity: O(n)
Space Complexity: O(1) .. modified the input array in-place
ALgorithm: if nums[p2] == nums[p1] and flag is false; change to true, duplicates are present, hence do p1++
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return nums.length;

        int p1 = 0, p2 = 1;
        boolean duplicateFlag = false;
        while(p2 < nums.length){
            if((nums[p2] == nums[p1]) && (!duplicateFlag)){
                p1++;
                nums[p1] = nums[p2];
                duplicateFlag = true;
            }else if(nums[p2] != nums[p1]){
                p1++;
                nums[p1] = nums[p2];
                duplicateFlag = false;
            }
            p2++;
        }
        return p1+1;
    }
}


/* 26. Remove Duplicates from Sorted Array
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}