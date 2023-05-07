88. Merge Sorted Array


// Time Complexity :O(m)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// In this p1 will be at the point were nums1 contents are not zeros;
// p2 will be at end of nums2;
// p3 will be at the end of nums1;
// by comparing value at p1 and p2 which ever is higher will be replaced at the p3 upon replacing pointers are moved accordingly.

// Your code here along with comments explaining your approach



class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        int p1=m-1;
        int p2=n-1;
        int p3=m+n-1;

        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>=nums2[p2])
            {
                nums1[p3]=nums1[p1];
                 p1--;
            }
            else
            {
                nums1[p3]=nums2[p2];
                p2--;
            }
            p3--;
        }
//      after above while loop if still elements are left in p2 we will replace those values in nums 1 array
        while(p2>=0)
        {
            nums1[p3]=nums2[p2];
            p3--;
            p2--;
        }

     return ;
        
    }
};
