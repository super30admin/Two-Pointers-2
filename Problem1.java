// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the length of the given array

// Your code here along with comments explaining your approach
    //We use 2 pointers, p1 and p2. p2 traverses the array looking for distinct numbers.
    //P1 comes behind p2 overwriting at most 2 indexes for every new number p2 comes across.
    //When p2 reaches the end, we return p1. All the numbers are present between "0" and "p1" indexes at most 2 times.

class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        int p1=0, p2=0;
        while(p2<n)
        {
            int number = nums[p2];
            int counter = 0;
            while(p2<n && number==nums[p2])
            {
                if(counter<2)
                {
                    nums[p1++] = nums[p2];
                    counter++;
                }
                p2++;
            }
        }
        return p1;
    }
}