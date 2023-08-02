//problem link
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 int a = nums1.length;
        int b = nums2.length;
        int[] c = new int[a + b];
        for (int i = 0; i < a; i++) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < b; i++) {
            c[nums1.length + i] = nums2[i];
        }
       Arrays.sort(c);
       double median=0.0;
        int mid=c.length/2;
        if(c.length%2==1)
        {
            median=c[mid];
        }
        else{
            median=(c[mid]+c[mid-1])/2.0;
        }
        return median;
        
        
}
}
