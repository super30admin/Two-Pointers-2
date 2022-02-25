// Time Complexity:           O(n)
// Space Complexity:          O(1)
// where n is length of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        RemoveDuplicates2 rd = new RemoveDuplicates2();
        System.out.println(rd.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {

        int k=0;

        // for(int i=0; i<nums.length; i++)
        // {
        //     if(k<2 || nums[k-2] != nums[i])
        //     {
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        for(int num:nums)
        {
            if(k<2 || nums[k-2] != num)                                 // if value changes within count 2
            {
                nums[k] = num;                                          // then only consider values
                k++;
            }
        }
        return k;


// ****************************** Another Approach ******************************
//        int j=0;
//        int counter=0;
//
//        for(int i=0; i<nums.length; i++)
//        {
//            if(i==0 || nums[i]==nums[i-1])                          // repeating number
//            {
//                counter++;                                          // then increment counter
//            }
//            else                                                    // new number
//            {
//                counter=1;
//            }
//            if(counter<=2)                                          // if count<=2
//            {
//                nums[j]=nums[i];                                    // then filling values
//                j++;
//            }
//        }
//        return j;
    }
}
