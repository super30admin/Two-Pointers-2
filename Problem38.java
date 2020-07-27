// Time Complexity : O(n)
// Space Complexity : O(1)

// Approach:
//     Loop through all the elements
//     Maintain 3 points, slow, fast & prev
//     if duplicate are > 2 then set the flag to true & increament the j
//     when 2 elements are not equal, swap the ekements

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length-1;
        
        int dup = 0;
        int i = 0;
        int j = 1;
        int cur = 1;
        
        while(j<=n){
            if(nums[i]==nums[j]){
                if(dup==0){
                    dup=1;
                    nums[cur] = nums[j];
                    cur++;
                    j++;
                } else{
                    j++;
                }
            }
            else {
                i = j;
                nums[cur] = nums[j];
                dup = 0;
                cur++;
                j++;
            }
        }
        return cur;
    }
}