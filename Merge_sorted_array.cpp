// Time Complexity: O(m+n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. We will use three pointers, i, j and k. i will point to the last element of the first array, j will point to the last element of the second array and k will point to the last element of the merged array.
// 2. We will compare the elements at i and j. If the element at i is greater than or equal to the element at j, we will insert the element at i at the kth position and decrement i.
// 3. If the element at j is greater than the element at i, we will insert the element at j at the kth position and decrement j.
// 4. We will keep decrementing k until i and j are greater than or equal to 0.

class Solution {
    public:
        void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            while(i >= 0 && j >= 0){
                if(nums1[i] >= nums2[j]){
                    nums1[k--] = nums1[i--];
                    // i--;
                }
                else{
                    nums1[k--] = nums2[j--];
                    // j--;
                }
                // k--;
            }
            while(j >= 0){
                nums1[k--] = nums2[j--];
                // k--;
                // j--;
            }
        }
    };