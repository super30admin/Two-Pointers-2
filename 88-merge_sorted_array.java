//Approach - 1: Copy elements from the smaller array to the larger array and then sort the larger array. TC: (m+n)log(m+n)
//Approach - 2: Using the 2-pointers approach rather we would be using 3-pointers here
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int end = m + n - 1;
        
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[end] = nums1[p1];
                p1--;
            } else{
                nums1[end] = nums2[p2];
                p2--;
            }
            end--;
        }
        
        //We do not work with the nums1 as they are alredy in the sorted fashion
        while(p2 >= 0){
            nums1[end] = nums2[p2];
            p2--;
            end--;
        }
    }
}