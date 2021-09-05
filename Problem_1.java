// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// same as the old approach just need to set swep insted of doing anything else if the count is grater then 2
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if( nums == null || nums.length == 0) return 0;
        int i = 1, j = 1, count = 1;
        while( j < nums.length){
            // increase the counter if both the values are same
            if( nums[j] == nums[j-1]){
                count++;
            }else{
                // reset the counter if the count
                count=1;
            }
            if( count < 3){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
/*
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// take two pointers which multiply more then two repetative number with 1000 and then sort them. Then find the count from where those 1000 multiple number is found, and return (the total count - the number of count we get from the 1000 multiple number)
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if( nums == null || nums.length == 0) return 0;
        int i = 0, j = 1;
        int n = nums.length;
        while(j < n){
            if(nums[i] == nums[j]){
                if( j-i > 1){
                    // to handle 0
                    if(nums[j] == 0){
                       nums[j] = 1000;
                    // to handle -ve values
                    }else if( nums[j] < 0){
                        nums[j] = nums[j]*(-1000);
                    }
                    else{
                       nums[j] = nums[j]*1000;
                    }
                }
                j++;
            }else{
                i = j;
                j++;
            }
        }
        Arrays.sort(nums);
        int ans = 0;
        for( int k = 0; k < n; k++){
            if(nums[k]/1000 != 0){
                ans++;
            }
        }
        return (n-ans);
    }
}
*/

