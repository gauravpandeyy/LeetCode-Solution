class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int[] ans=new int[k];
        Arrays.sort(arr);
        int n=arr.length-1;
        int median=arr[n/2];
        for(int i=0,j=n,x=0;x<k;x++)
        {
            if(Math.abs(arr[i]-median)<=Math.abs(arr[j]-median))
            {
                ans[x]=arr[j--];
            }
            else{
                ans[x]=arr[i++];
            }
        }
        return ans;
    }
}