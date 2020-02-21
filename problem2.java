# Time complexity:O(m+n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1;
        int second = n-1;
        int position = m+n-1;
        while(position >=0){
            if(first >= 0 && second >= 0){
                if(nums1[first] > nums2[second]){
                    nums1[position] = nums1[first];
                    first--;
                }
                else{
                    nums1[position] = nums2[second];
                    second--;
                }
            }

            else if(first == -1){
                nums1[position] = nums2[second];
                second--;
            }
            position--;
        }
    }
}
