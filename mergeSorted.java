// Time Complexity  : O(m+n) where m is length of nums1 and n is length of nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
public class mergeSorted {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int num2p = n-1;
            int num1p = m-1;
            int index = nums1.length-1;
            while(num2p >=0 && num1p >=0){
                if(nums2[num2p]>nums1[num1p]){
                    nums1[index] = nums2[num2p];
                    num2p--;
                    index--;
                }
                else{
                    nums1[index] = nums1[num1p];
                    num1p--;
                    index--;
                }
            }
            while(num1p<0&&index>=0){
                nums1[index] = nums2[num2p];
                num2p--;
                index--;
            }
            
        }
    }

