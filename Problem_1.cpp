//Time complexity is O(n)
//Space complexity is O(1)

/*Approach:
We are maintaing two arrays. Both of them start from the left end. As we know that we cannot have more than two duplicates, so 
the first two values can be copied as such. After that we start comparing that if the value at the current index is greater than
the value at the count index(difference between the count index and 2 ) then we add it to the index in the array where my count index
points and we increment the count index by 1*/


class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        for (int j = 0; j <nums.size(); j++) {
            if (i < 2 || nums[j] > nums[i - 2])
                nums[i++] = nums[j];
        }
        return i;
        
    }
};