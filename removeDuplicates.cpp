// given an array
//nums=[1,2,2,2,3,3,4,4,4]
// 
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty())
            return 0;

        int i = 1;
        int count = 1;

        for(int j = 1; j < nums.size();j++)
        {
            if(nums[j] == nums[j-1]){
                count++;
            }
            else{
                count = 1;
            }

            if(count <= 2)
                nums[i++] = nums[j];
        }
        return i;
    }
};