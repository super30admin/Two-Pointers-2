// Merge Sorted Array 
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n -1;

        while(len1 >= 0 && len2 >= 0){
            //if(nums1[len1] > nums2[len2]){
            //    nums1[len--] = nums1[len1--];
            //}else{
            //    nums1[len--] = nums2[len2--];
            //}
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];

        }

       while(len2 >= 0){      // checking for any elements remaining in the nums2 vector
           nums1[len--] = nums2[len2--];
       }


    }
};

//Time Complexity: O(m+n), because we are traversing both the arrays nums1 and nums2
//Space Complexity: O(1), because we are not using additional space
