// Time Complexity : O(m)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        int low = m-1;
        int high = nums1.size()-1;
        
        // Shift all nums1 elements to the end
        while(low >= 0)
        {
            nums1[high] = nums1[low];
            low--;
            high--;
        }
        
        int p1 = n;
        int p2 = 0;
        
        //Merge
        for(int i = 0; i < nums1.size(); i++)
        {
            if(p1 == nums1.size())
            {
                nums1[i] = nums2[p2];
                p2++;
                continue;
            }
            
            if(p2 == n)
            {
                nums1[i] = nums1[p1];
                p1++;
                continue;
            }
            
            if(nums1[p1] < nums2[p2])
            {
                nums1[i] = nums1[p1];
                p1++;
            }
            else
            {
                nums1[i] = nums2[p2];
                p2++;
            }
        } 
    }
};