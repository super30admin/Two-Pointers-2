/**
 * # Idea:
 * 1. Two pointers each for nums1 and nums2
 * 2. Compare nums1 and nums2. Copy lesser element to result. Move the lesser pointer
 * 3. Copy the arrays if they have remaining elements. Copy the result array to nums1. 
 * 
 * # Time Complexity: O(n)
 * # Space Complexity: O(n) - extra array of size N is used.
 * # Leetcode : Yes
 */
class MergeSortedArrays{

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[nums1.length];
        int i=0, j=0, k=0;
        for(;i<m && j < n;){
            if(nums1[i] > nums2[j]){
                res[k] = nums2[j];
                j++; k++;
            }
            else{
                res[k] = nums1[i];
                i++; k++;
            }
        }
        // nums2 is completely copied
        if(j == nums2.length){
            int x = i;
            while(x < m){
                res[k] = nums1[x];
                k++;
                x++;
            }
        }
        //num1 is completely copied
        else{
            int x = j;
            while(x < n){
                res[k] = nums2[x];
                k++;
                x++;
            }
        }
        System.arraycopy(res, 0, nums1, 0, res.length);
    }
    public static void main(String[] args){
        System.out.println("Merge Sorted Arrays");
        MergeSortedArrays obj = new MergeSortedArrays();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        obj.merge(nums1, m, nums2, n);
    }
}