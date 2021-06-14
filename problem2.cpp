// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

//start from the end of nums2 and mth pos of nums1 check for largetst among the two and populate the last elements of nums1 and move the pointer to the left from where the larger number is found

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=m+n-1;
        int ptr1=m-1;
        int ptr2=n-1;
        while(ptr1>=0 && ptr2>=0)
        {
            if(nums2[ptr2]>nums1[ptr1])
            {
                nums1[i]=nums2[ptr2];
                ptr2--;
            }
            else
            {
                nums1[i]=nums1[ptr1];
                ptr1--;
            }
            i--;
        }
        while(ptr2>=0)
        {
            nums1[i]=nums2[ptr2];
            i--;
            ptr2--;
        }
    }
};
