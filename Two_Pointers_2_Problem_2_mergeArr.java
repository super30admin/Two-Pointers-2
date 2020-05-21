//Time complexity : O(n) where n = length of bigger array
//Space Complexity : O(1)
//Runs successfully on leetcode
//No problem

//Here we'll be maintaining three pointers
//One will be the last position on bigger array
//The other two will be on the last numbers on both the filled array
//By manipulating these three pointers we'll be able to get the desired result


public class Two_Pointers_2_Problem_2_mergeArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid = m + n - 1;
        int fast = n - 1;
        int slow = m - 1;
        while(slow >= 0 && fast>= 0)
        {
            if(nums1[slow] > nums2[fast])
            {
                nums1[mid] = nums1[slow];
                slow--;
            }
            else if(nums1[slow] <= nums2[fast] )
            {
                nums1[mid] = nums2[fast];
                fast--;
            }
            mid--;
        }

        while(fast >= 0)
        {
            nums1[mid] = nums2[fast];
            fast --;
            mid --;
        }
    }
}
