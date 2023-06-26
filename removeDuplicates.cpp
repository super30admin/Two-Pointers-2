// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int ptr = 0; 
        int count = 1; 

        for(int i = 1; i < nums.size(); i++) {
            if(nums[i] == nums[ptr]) {
                count++; 
            } else {
                count = 1; 
            }
            
            if(count <= 2) { 
                ptr++;
                nums[ptr] = nums[i]; 
            } 
        } 
        return ptr+1;    
    }
};