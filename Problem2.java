// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class Problem2 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //brute force approach
        //copying all elements of nums2 to nums1 and then sorting nums1
        //Time compleixity : O(n + m+n(log(m+n)))
//        int i = m;
//        int j=0;
//        while(i<m+n){
//
//            nums1[i++] = nums2[j++];
//
//
//        }
//        Arrays.sort(nums1);
//    }

        //second approach
        //using three pointers

        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {

            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;


        }
        while (p2 >= 0) {
            //if there are still some elements left
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}

