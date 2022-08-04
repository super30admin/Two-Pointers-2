class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 =m-1;
        int tail2 = n-1;
        int full_tail = m+n-1;
        
        while(tail1>=0 && tail2>=0){
            if(nums1[tail1] > nums2[tail2]){
                nums1[full_tail] = nums1[tail1];
                tail1--;
            }
        else{
            nums1[full_tail] = nums2[tail2];
            tail2--;
        }
        full_tail--;
        }
        while(tail2>=0){
            nums1[full_tail]=nums2[tail2];
            full_tail--;
            tail2--;
        }
    }
}
