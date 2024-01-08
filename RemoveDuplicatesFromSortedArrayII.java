
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yess
// Three line explanation of solution in plain english: We took two pointers and check if duplicates element count is lee than or equla to K thats two in this case. Then we swap the element until condition get false and increase fast pointer. Print till slow pinter values

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int n= nums.length;
        int p1=0;
        int p2=1;
        int count=1;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
        
            if(count<=k){
                p1++;
                nums[p1]=nums[p2];
            }
            p2++;
        }
    return p1+1;    
    }
}
