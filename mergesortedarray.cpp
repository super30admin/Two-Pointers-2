//Time complexity : O(m + n)
//Space complexity : O(1)

//Approach:
            // Start filling array from back
            // Keep two pointers at the end of m and n (given filled arrays)
            // Start comparing and filling from the end
            // At the end, fill all the remaining elements of second array

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n == 0)
            return;
        if(m == 0)
        {
            nums1 = nums2;
            return;
        }
        
        
        int p1 = m - 1;
        int p2 = n - 1;
        int pos = nums1.size() - 1;
        
        while(p1 >= 0 && p2 >= 0)
        {
            if(nums1[p1] >= nums2[p2])
            {
                nums1[pos] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[pos] = nums2[p2];
                p2--;
            }
            pos--;
        }
        
        while(p2 >= 0)
        {
            nums1[pos] = nums2[p2];
            p2--;
            pos--;
        }
    }
};