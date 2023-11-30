// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes

// Two pointer approach of slow and fast pointers and a flag to count num of duplicates.
//For every nth element, check if n-1 and n+1 elements are same, if yes, overwrite n+1 with next element.
public class RemoveDuplicates2 {

    public static void main(String[] args) {
        int[] in = new int[]{1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,4};
        int res = removeDuplicatesFromSortedArray2(in);
        System.out.println(res);
        for(int i : in)
            System.out.println(i);
    }
    public static int removeDuplicatesFromSortedArray2(int[] in){
        int prev =0, slow = 0, fast = 1, flag = 0;

        while(fast<in.length){
            if(in[prev] == in[fast]){
                if(flag==0){
                    flag++;
                    in[slow] = in[fast];
                    slow++;
                    fast++;
                } else {
                    fast++;
                }
            } else {
                prev = fast;
                in[slow] = in[fast];
                slow++;
                fast++;
                flag = 0;
            }
        }
        return slow;
    }
}
