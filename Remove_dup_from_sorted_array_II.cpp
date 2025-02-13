// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. We will use two pointers, slow and fast. Slow will keep track of the position where we can insert the next element.
// 2. We will keep a flag to check if the element has already been inserted once. If yes, we will skip the next element.
// 3. If the element is not equal to the previous element, we will update the previous element and insert the current element at the slow pointer.
// 4. If the element is equal to the previous element, we will check if the flag is 0. If yes, we will insert the element at the slow pointer and update the flag.
// 5. If the flag is 1, we will skip the element and move the fast pointer.
// 6. We will return the slow pointer as the length of the new array.

class Solution {
    public:
        int removeDuplicates(vector<int>& nums) {
            int flag  = 0; 
            int prev = 0; 
            int slow = 1, fast = 1; 
    
            while(fast < nums.size()){
                if(nums[fast] == nums[prev]){
                    if(flag == 0){
                        nums[slow] = nums[fast];
                        slow++;
                        fast++;
                        flag = 1; 
                    }
                    else{
                        fast++;
                    }
                    
                }
                else{
                    prev = fast;
                    nums[slow] = nums[fast];
                    slow++;
                    fast++;
                    flag = 0; 
                    }
                
            }
            return slow;
        }
    };