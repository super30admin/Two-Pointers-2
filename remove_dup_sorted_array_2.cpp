//Time comlpexity - O(n)
//Space complexity - O(1)
//Ran successfully on leetcode
//3 points algo is the following - 
	//We will be having two pointer, one at 0 and the other at 1.
    //We also have a flag which if true, tells us that the duplicate has already occured, else that it hasnt
    //We iterate through the array and compare the elements at slow and fast pointers
    //If the items arent equal, then we make the flag 0 and move ahead
    //If they are equal, flag will tell us if the dup has occured before and accordingly we can replace the elements and move ahead

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {		
        if(nums.empty())
            return 0;
        int p1=0,p2=1,flag=0;
        while(p2<nums.size())
        {
            if(nums[p1]==nums[p2])
            {
                if(flag==0)
                {
                    flag=1;
                    p1++;
                    nums[p1]=nums[p2];
                    p2++;
                }
                else
                {
                    //while(p2<nums.size() && nums[p1]==nums[p2])
                        p2++;
                }
            }
            else
            {
                flag=0;
                p1++;
                nums[p1]=nums[p2];
                p2++;
            }
        }
        return (p1+1);
    }
};