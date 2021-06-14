// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Your code here along with comments explaining your approach :check if the elements are repeated less then k if not push new elements to its position 




class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
     int n=nums.size();
     int k=2;
     if(n==0)
     {
         return -1;
     }
     int count =1;
     int j=1;
     for(int i=1;i<n;i++)
     {
         if(nums[i]==nums[i-1])
         {
             count++;
         }
         else
         {
             count=1;
         }
         if(count<=k)
         {
             nums[j]=nums[i];
             j++;
         }
     }
       return j;
    }
};
