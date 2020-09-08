//Time Complexity: O(n)
//Space Complexity: O(m+n)

import java.util.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[m+n];
        int k=0;

        // getting the count of the each array element except 0's and adding to result
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]!=0){
                if(map.containsKey(nums1[i])){
                    map.put(nums1[i], map.get(nums1[i])+1);
                }
                else{
                    map.put(nums1[i],1);
                    
                }
                result[k] = nums1[i];
                k++;
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]!=0){
                if(map.containsKey(nums2[i])){
                    map.put(nums2[i], map.get(nums2[i])+1);
                }
                else{
                    map.put(nums2[i],1);
                    
                }
                result[k] = nums2[i];
                k++;
            }
        }
        System.out.println(map);
        Arrays.sort(result);
        for(int i=0; i<result.length; i++){
            nums1[i] = result[i];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {42,15,6,0,0};
        int[] arr2 = {14,5,0,0,0};
        merge(arr1, 3, arr2, 2);
    }
}