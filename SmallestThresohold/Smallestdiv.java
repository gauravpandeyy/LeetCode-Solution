//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        public int maxEl(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        return maxi;
    }
  public static int sumyD(int[] arr,int d)
  {   int sum=0;
      int n=arr.length;
      for(int i=0;i<n;i++)
      {
          sum=sum+(int)Math.ceil((double)(arr[i])/(double)(d));
      }
      return sum;
  }  
public int smallestDivisor(int[] nums, int threshold) {
  int low=1; int high=maxEl(nums);
  while(low<=high)
{
    int mid=low+(high-low)/2;
    if(sumyD(nums,mid)<=threshold)
    {
        high=mid-1;
    }
    else{
        low=mid+1;
    }

}
return low;
}
    }
