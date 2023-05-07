// 80. Remove Duplicates from Sorted Array II

// Time Complexity :O(m)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Here I will use two pointer approach i pointer for counting the occurences and j pointer 
// is for maintaining constraint of two duplicte copies.I will replace the value of j with i if count<=2
// After traversal I will return j

// Your code here along with comments explaining your approach

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {

        // 1,1,1,2,2,3 
        // Here i pointer is to count the occurences and j is to maintain duplicates of count max 2;
        int count=1;
       
        int j=1;

        for(int i=1;i<nums.size();i++)
        {
          if(nums[i]==nums[i-1])
          {
              count++;
          }
          else
          {
              count=1;
          }

            if(count<=2)
            {
                nums[j]=nums[i];
                j++;
            }
        

        }

         return j;

        
    }
};