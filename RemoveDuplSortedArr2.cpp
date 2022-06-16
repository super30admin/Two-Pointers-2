// Approach 1 - I used a hashmap to keep a count of elements in the input vector.
// Time Complexity - O(n) - Since we are iterating over the 'nums' vector with 'n' elements.
// Space Complexity - O(n) - Since we are initializing a map whose size may reach upto 'n' in the owrst case scenario.
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        unordered_map<int, int> m;
        int n = nums.size();
        for(int i = 0; i < n; i++){
            if(!m.count(nums[i]))
                m[nums[i]] = 1;
            else
                m[nums[i]]++;
        }
        
        int p = 0;
        for(int i = 0; i < n; i++){
            if(m[nums[i]] >= 2){
                nums[p] = nums[i];
                nums[p+1] = nums[i];
                p += 2;
                m.erase(nums[i]);
            }
            else if(m[nums[i]] == 1){
                nums[p] = nums[i];
                p++;   
            }
        }
        return p;
    }
};

// Approach 2 - Below solution does not use a hashmap to keep a count, instead, the count for an element is kept as we iterate through the input vector.
// Time Complexity - O(n) - Since we are iterating over the 'nums' vector with 'n' elements.
// Space Complexity - O(1), since only 2 variables are needed for below solution which remains constant even if total number of elements change in the input vector.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int count = 1;
        int n = nums.size();
        int s = 1;
        
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            
            if(count <= 2){
                nums[s] = nums[i];
                s++;
            }
        }
        return s;
    }
};