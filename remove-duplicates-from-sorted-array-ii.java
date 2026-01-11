// Time Complexity : O(2n) = O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : We use two pointers, slow and fast. The fast pointer moves forward and counts how many times the same digit appears. When the fast pointer encounters a new element or reaches the end of the array, we check the digit count. We take the minimum of the digit count and 2, and then use the slow pointer to update the array. Once the fast pointer reach the end of array we return the slow index.

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow =0;
        int fast =0;
        int count =0;
        while(fast< nums.length) {
            int curr = nums[fast];
            while(fast<nums.length && nums[fast] == curr) {
                fast++;
                count++;
            }
            int iter = Math.min(count,2);
            while(iter !=0) {
                nums[slow] = curr;
                slow++;
                iter --;
            }
            count =0;
        }
        return slow;
    }
}


// Another approach which works perfectly with same time and space complexity

//         int slow = 0;
//         int fast = 0;
//         int count =1;
//         while(fast < nums.length) {
//             if(fast == nums.length-1) {
//                     int iter = Math.min(count, 2);
//                     for(int i=0; i<iter; i++) {
//                         nums[slow] = nums[fast];
//                         slow++;    
//                 }
//                 break;
//             }

//             if(nums[fast] == nums[fast+1]) {
//                 count+=1;
//             } else {
//                 int iter = Math.min(count, 2);
//                 for(int i=0; i<iter; i++) {
//                     nums[slow] = nums[fast];
//                     slow++;
//                 }
//                 count =1;
//             }
//             fast++;
//         }
//         return slow;
//     }
