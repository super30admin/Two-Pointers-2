// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// use two pointer approach, start both pointers at 1 index and count similar numbers, 
// if count <=2 ,we need to update the array, or else skip those numbers

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty() || nums.size()==0){
            return 0;
        }
        int n = nums.size();
        int p1 = 1;
        int p2 = 1;
        int c=1;
        while(p1<=n-1)
        {
            int p = nums[p1-1];
            if(nums[p1] == p)
            {
                c++;
            }
            else{
                c=1;
            }
            if(c<=2)
            {
                nums[p2] = nums[p1];
                p2++;
            }
            p1++;
        }
        return p2;
    }
};