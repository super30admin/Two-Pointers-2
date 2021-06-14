// Time Complexity:  O(m+n)
// Space Complexity: O(1)

package leetcode;

public class Fanng37 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int insertptr= m+n-1;
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]>nums2[ptr2]){
                nums1[insertptr]=nums1[ptr1];
                insertptr--;
                ptr1--;
            }else{nums1[insertptr]=nums2[ptr2];
                insertptr--;
                ptr2--;
            }
        }
        if(ptr1<0){
            while(ptr2>=0){
                nums1[insertptr]=nums2[ptr2];
                insertptr--;
                ptr2--;
            }
        }
    }
}
