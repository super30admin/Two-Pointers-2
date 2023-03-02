// Brute force
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<m+n;i++,j++){
            if(j<n){
                nums1[i] = nums2[j];
            }
        }
        Arrays.sort(nums1);
    }
}

// TC - O((m+n)log(m+n))
// SC - O(1)


// optimized - three pointers
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, p3 = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            }else{
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        while(p2>=0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}

// TC - O(m+n)
// SC - O(1)