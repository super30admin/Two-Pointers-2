//Time Complexity: O(n) — Each element is visited once.
//Space Complexity: O(1) — In-place modification, no extra space used.

//Use two pointers: one (insertPos) to build the result, another (scanPos) to scan the array.
//Compare current element with the element maxAllowed positions before to allow at most two duplicates.
//If valid, copy the element to insertPos and increment it; always move scanPos forward.

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int maxAllowed = 2;
        int insertPos = maxAllowed;
        int scanPos = maxAllowed;

        while(scanPos < nums.length){
            if(nums[insertPos - maxAllowed] != nums[scanPos]){
                nums[insertPos] = nums[scanPos];
                insertPos++;
            }
            scanPos++;
        }

        return insertPos;
    }
}
