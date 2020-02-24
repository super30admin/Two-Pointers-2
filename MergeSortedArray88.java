//time complexity : in worst case nlogn
//space complexity : O(1)
//leet code execution :  successfull
// steps: used two pointers first and second. each of assigned with locations of m and n respectively.
//on every iteration value of nums1 at pointer fast firsst is compared with value of nums2 at pointer second. if nums1 val is higer than nums2, the value at that index it asiigned at end of m/n +1 respectively.
//likewise loop iterates until all the elements in nums1 exhaust. now check if nums2 is empty or not ..if not iterate and place'em in nums1[first]. 
class MergeSortedArray88{

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
     
        int first =m-1,second=n-1;

        while(first>=0 || second >=0){
            if(nums1[first]>nums2[second]){
                nums1[first+second+1]= nums1[first];
                first--;
            }
            else {
                nums1[first+second+1]=nums2[second];
                second--;
            }

        }

        while(second>=0){
            nums1[second]=nums2[second];
            second--;
        }

    //    for(int i=m; i<nums1.length;i++){
    //        nums1[i]=nums2[i-n];
    //    }
    //    Arrays.sort(nums1);   
    //    for (int ii : nums1) {
    //        System.out.println(ii);
    //    }
    
    }




    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        MergeSortedArray88 msa = new MergeSortedArray88();
        msa.merge(nums1, 3, nums2, 3);
    }
}