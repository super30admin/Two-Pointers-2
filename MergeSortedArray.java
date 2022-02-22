/*
Time Complexity: O(m+n)
Space Complexity: O(1)
Code run on leetcode: yes
Any difficulties: no

Approach: Two pointer
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;

        for(int i = m+n-1; i>=0; i--){
            if(p2<0){
                break;
            }
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i] = nums1[p1--];
            }else{
                nums1[i] = nums2[p2--];
            }
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);
        for(int i = 0; i<nums1.length; i++){
            System.out.print(nums1[i]+",\t");
        }
    }
}
