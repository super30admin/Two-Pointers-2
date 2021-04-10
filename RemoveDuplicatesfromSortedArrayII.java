/*

Thought Process: Use two pointers - Swap pointer and Fast Pointer. Swap pointer will be used to swap at every point and fast pointer matches with prev element and maintains count. Since only 2 duplicates are allowed, keep count limited to 2.

TC -> O(N) -> Single Pass
SC -> O(1) -> We use two variables to store the pointers

Mistakes committed ? -> Took some time to understand the right approach. Once figured on WB, easily coded without mistakes on LC.

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return 1;
        
        // fa -> FAST pointer & sw -> SWAP pointer
        int sw = 1, fa = 1, cnt = 1;
        while(fa < nums.length){
            if(nums[fa] == nums[(fa - 1)]) cnt++;
            else cnt = 1;
            
            nums[sw] = nums[fa];
            
            if(cnt <= 2){
                fa++;
                sw++;
            }
            else fa++;
        }
        return sw;
    }
}