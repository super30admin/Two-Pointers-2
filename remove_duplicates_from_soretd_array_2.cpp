// time : o(n)
// space : o(1)

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int count = 1;
        int pt = 1;

        for(int i =1 ; i < nums.size(); i++)
        {
            if(nums[i] == nums[i-1])
            {
                //count duplicates
                count++;
            }
            else
            {
                count = 1;
            }

            if(count <= 2)
            {
                nums[pt] = nums[i];
                pt++;
            }
        }

        return pt; // return index at which last swap was done

    }
};