//remove duplicates from sorted array 2
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        for (int n:nums)
            if(i < 2 || n > nums[i - 2])
            nums[i++] = n;

        return i;

    }
};

//Time Complexity: O(n)
//Space COmplexity:O(1)
