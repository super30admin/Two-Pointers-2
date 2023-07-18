
// Time Complexity :O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//Merge sorted arrays: Start comparing last elements of nums1 from index m and nums2 from index n.
//Correctly place the higher element in nums1 and decrease the pointer in the array which had higher element.
//Repeat the process till atleast one array is fully iterated. This will take care of elements from num1 indexes which were correctly placed already towards end if they were higher.
//Lastly if nums2 still have elements, then copy it over in nums1 at their correct indices.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i =m-1, j = n-1;
        int curr = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]) {
                nums1[curr] = nums1[i];
                i--;
            }else {
                nums1[curr] = nums2[j];
                j--;
            }
            curr--;
        }

        while(j>=0){
            nums1[curr] = nums2[j];
            j--;curr--;
        }
        
    }
}