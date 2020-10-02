// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size()<3) //if the size of the array is less than the 3 then return the size of the array
            return nums.size();
        
        for(int i=0;i!=nums.size()-2;i++){
           // cout<<i<<" "<<endl;
            if (nums[i]==nums[i+1] && nums[i]==nums[i+2]) {
                nums.erase(nums.begin()+i); //erase the first number in the group of numbers
                i--;
            }
        }
        return nums.size(); //return the size
    }
};