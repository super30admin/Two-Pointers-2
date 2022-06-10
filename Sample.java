//****MERGE TWO SORTED ARRAYS****
// Time Complexity :o(m+n);
// Space Complexity :o(1);
// Did this code successfully run on Leetcode :Y

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=nums1.length-1;
        int p1=m-1;
        int p2=n-1;
        
        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[p]=nums1[p1];
                p--;
                p1--;
            }
            else
            {
                nums1[p]=nums2[p2];
                p--;
                p2--;
            }
        }
        
        while(p2>=0)
        {
           nums1[p]=nums2[p2];
            p--;
            p2--; 
        }
        
    }
}
//****SEARCH IN 2D MATRIX-2****
//TIME complexity:o(m+n);
//SPACE complexity:o(1);
//Leetcode runnable:Y
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n=matrix[0].length;
        if(matrix==null || matrix.length==0)
        {
            return false;
        }
        
        int i=0;
        int j=n-1;
        
        while(i<m && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            //if less go to left
            else if(matrix[i][j]>target)
            {
                j--;   
            }
            //if more, go down
            else
            {
                i++;
            }
        }
        
        return false;
        
        
    }
}
//****REMOVE DUPLICATES-2****
//TIME complexity:o(n);
//SPACE complexity:o(1);
//Leetcode runnable:Y
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        int count=1;
        int slow=1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            
            if(count<=2)
            {
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
}
//****SORT COLORS****
//TIME complexity:o(n);
//SPACE complexity:o(1);
//Leetcode runnable:Y
class Solution {
    public void sortColors(int[] nums) {
        int high=nums.length-1;
        int low=0;
        int mid=0;
        //low->0
        //mid->1
        //high->2
        
        while(mid<=high)
        {
            if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else
            {
               int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }
}
