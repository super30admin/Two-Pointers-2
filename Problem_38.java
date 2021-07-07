/**
LeetCOde Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)

The idea is to have slow and fast pointers where checking each pointers at each position where we compare the values and see if the pointers need to change. Also, keeping a flag for checking if the characters are repeating more than 2

**/
class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        boolean flag = false;
        int first = 0;
        int second = 1;
        
        if(nums == null || nums.length < 1)
            return 0;
        
        while(second < nums.length){
            //case 1
            if(nums[first] == nums[second]){
                //case 1.1 (if no repeats)
                if(flag == false){
                    first ++;
                    flag = true;
                    nums[first] = nums[second];
                    second ++;
                }else{ //case 1.2 (if repeats more than 2 values)
                    while(second < nums.length && nums[second] == nums[second - 1])
                        second ++;
                }
            }else{ //No similar between fast and slow pointer
                first ++;
                flag = false;
                nums[first] = nums[second];
                second ++;
            }
        }
        
        return (first + 1);
        
    }
}
