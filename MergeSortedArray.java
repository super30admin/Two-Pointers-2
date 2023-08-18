// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Here we are comaping elemt of num1 and num2. if num1 elemtnt is lower then will copy num2 elas eeill kepp num1 in index.
class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; //Pointing  end of last nonzero number of num1 array.
        int p2 = n-1; // Pointing end of num2 array
        int idx = m+n-1; // pointing end of num1 array

        while(p1>=0 && p2>=0){
            if(nums1[p1] <= nums2[p2]){
                nums1[idx] = nums2[p2];
                p2--;
            }else{
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }
        while(p2>=0){
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}