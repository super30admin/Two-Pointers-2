// Time Complexity :  O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int count;
        int i=0,j=0;
        while(j<nums.length){
            count=0;
            int num= nums[j];
            while(j<nums.length && nums[j]==num){
                count++;
                j++;
            }
            if(count>=2){
                nums[i]=num;
                nums[i+1]=num;
                i+=2;
            }
            else{
                nums[i]=num;
                i++;
            }
        }
        return i;
    }
}



// Time Complexity :  O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  Yes

class Solution2 {
    public int removeDuplicates(int[] nums) {

        int i=0;

        for(int num: nums){
            if(i<2 || nums[i-2]!=num){
                nums[i]=num;
                i++;
            }
        }
        return i;
    }
}