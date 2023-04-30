
// Time Complexity : O(m+n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// we compare the largest numbers in each array one by one , and place that number in larger array which has 0's in it.
// using two pointer approach

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int k = nums1.size()-1;
        int p1 = m-1;
        int p2 = n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2])
            {
                nums1[k--] = nums1[p1--];
            }
            else
            {
                nums1[k--] = nums2[p2--];
            }
        }
        while(p2>=0)
        {
            nums1[k--] = nums2[p2--];
        }
        
    }
};