class Solution {
    //Using HASHMAP
    public int removeDuplicates(int[] nums) {
        int i =0;
        HashMap<Integer,Integer> hmap = new LinkedHashMap<>();
        for(int n : nums){
            hmap.put(n,hmap.getOrDefault(n,0)+1);
        }
        for(int n : hmap.keySet()){
            if(hmap.get(n)==1){
                nums[i++]=n;
            }
            else{
                nums[i++]=n;
                nums[i++]=n;

            }
        }


        return i;

    }
}
USING TWO POINTER APPROACH
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A == null) {
            return 0;
        }
        if (A.length <= 2) {
            return A.length;
        }
        int insert = 1, index = 1;
        int freq = 1;
        while (index < A.length) {
            if (A[index] == A[insert - 1] && freq == 1) {
                A[insert] = A[index];
                insert++;
                freq++;
            }
            if (A[index] != A[insert - 1]) {
                A[insert] = A[index];
                insert++;
                freq = 1;
            }
            index++;
        }
        return insert;
    }
}


