class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m - 1;
        int p2 = n -1;
        int idx = nums1.length - 1;
        
        while(p1 >= 0 && p2 >= 0){
            
            if(nums2[p2] > nums1[p1]){
                nums1[idx] = nums2[p2];
                idx--;
                p2--;
            }
            else{
                nums1[idx] = nums1[p1];
                p1--;
                idx--;
            }
        }
        while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
        
    }
}

//Time Complexity: O(n+m)
