//time - n
//space - n

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int counter1 = 0;
        int counter2 = 0;
        int index = 0;
        int[] nums = new int[nums1.length];

        while(counter1<m && counter2<n)
        {
            if(nums1[counter1]<nums2[counter2])
            {
                nums[index++] = nums1[counter1];
                counter1++;
            }
            else
            {
                nums[index++] = nums2[counter2];
                counter2++;
            }
        }

        while(counter1<m)
        {
            nums[index++] = nums1[counter1];
            counter1++;
        }

        while(counter2<n)
        {
            nums[index++] = nums2[counter2];
            counter2++;
        }


        for(int i=0 ; i<nums1.length ; i++)
        {
            nums1[i] = nums[i];
        }


    }
}
