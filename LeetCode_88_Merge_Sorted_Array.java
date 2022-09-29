//approach - BF
// union + sort; this will give array of final result, also ignore zero there. 

//Approach -2
//start from the end of both the array
//n1 = nums1.length, n2 = nums2.length; 
//n1-n2 is the target where n3-1 exists, n3-1 is the end of nums1 values!
//TC- O(m+n)
//sc O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1 = m-1;
        int n2 = n-1;
        int n3 = m+n -1;
        
        while(n1>=0 && n2>=0)
        {
            if(nums1[n1] > nums2[n2])
            {
                nums1[n3] = nums1[n1];
                n1--;
            }
            else
            {
                nums1[n3] = nums2[n2];
                n2--;
            }
            n3--;
        }
        while(n2 >=0)
        {
            nums1[n3] = nums2[n2];
            n3--;
            n2--;
        }
    }
}