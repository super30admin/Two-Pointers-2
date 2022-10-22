// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no



public class MSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insert  = nums1.length - 1;
        int p1 = m-1;
        int p2 = n-1;

        while ( p1 >= 0 && p2>=0){
            if (nums2[p2] < nums1[p1]){
                nums1[insert] = nums1[p1];
                p1--;
            }
            else{
                nums1[insert] = nums2[p2];
                p2--;
            }
            insert--;
        }

        while (p2 >= 0){
            nums1[insert] = nums2[p2];
            p2--;
            insert--;
        }
    }

    public static void main(String[] args){
        int[] num1 = {1,2,3,0,0,0};
        int [] num2 ={2,5,6};
        int m = 3;
        int n =3;

        MSortedArray obj = new MSortedArray();
        obj.merge(num1, m, num2, n);
    }
}