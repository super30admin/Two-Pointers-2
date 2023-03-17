class Solution {
    public int removeDuplicates(int[] nums) {
        //1 1 1 2 2 3 3
        int s = 0;
        int f = 1;
        int k =2;
        int count =1;
if(nums.length==1) return 1;
        while(f<nums.length){
           // int count = 0;
            if( nums[f]== nums[s]) {
                count++;
               // f++;
                if(count<=k)    {
                    s++;
                    nums[s]=nums[f];
                    
                }
                f++;
            }
            else {
                s++;
                nums[s]=nums[f];
                //new element found
                count=1;
                f++;
          
        }
    }
    return s+1;
}
}