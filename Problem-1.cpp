//Time Complexity = O(N)
//Space Complexity = O(1)
//where N is the number of elements in vector nums.
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i,j=1,count=1;
        for(i=1;i<nums.size();i++)
        {
            if(nums[i]==nums[i-1])                //we are checking that is the previous element is same as the current element.
                count++;
            else
                count=1;                          //if we encounter a new element we restart our counter.
            if(count<=2)                          
            {
                nums[j]=nums[i];                  //Our j will point the position in the vector where we can enter our new element.
                j++;
            }
        }
        return j;
    }
};
