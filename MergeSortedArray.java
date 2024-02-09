//The algorithm performs an in-place merge of two sorted arrays nums1 and nums2 with lengths m and n. 
//It uses three pointers (p1, p2, and idx) to iterate through the arrays and merge the elements in descending order. 
//The time complexity is O(m + n), where m and n are the lengths of nums1 and nums2, and the space complexity is O(1).
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }
            else{
                 nums1[idx] = nums2[p2];
                 p2--;
            }
            idx--;
        }
        

         while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}