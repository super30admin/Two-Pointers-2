// Time Complexity : O(m+n)
// Space Complexity : O(1)

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int first = m-1;
        int second = n-1;
        for (int result=m+n-1; result>=0; result--) {

            if (first >= 0 && second >= 0) {
                if (nums1[first] > nums2[second]) {
                    nums1[result] = nums1[first--];
                } else {
                    nums1[result] = nums2[second--];
                }
            }
            else if (second >= 0) {
                nums1[result] = nums2[second--];
            } else {
                first--;
            }

        }
    }
};