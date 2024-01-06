//time complexity: o(n)
//space complexity: o(1)
class Problem1 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int cnt = 1;
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            } else {
                cnt = 1;
            }
            if(cnt<=2){
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow+1;
    }
}
