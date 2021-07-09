//Time Complexity: O(NLogN)
//Space Complexity: O(1)
import java.util.Arrays;
class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<nums1.length;i++,j++){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}

//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2 ==null || n== 0){
            return;
        }
        int x=m-1;
        int y=n-1;
        int i=nums1.length-1;
        while(x>=0 && y>=0) {
            if(nums1[x]>=nums2[y]){
                nums1[i--]=nums1[x--];
            }else{
                nums1[i--]=nums2[y--];
            }
        }

        while(y>=0){
            nums1[i--]=nums2[y--];
        }
    }
}



