class Solution {
    public long countPairs(int[] nums, int k) {
        long ans=0;
        Map<Integer , Integer> gcds=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int gcdfrom1=findgcd(nums[i],k);
            for(int gcdfrom2:gcds.keySet())
            {
                if((long) gcdfrom2* gcdfrom1%k==0 )
                {
                    ans+=gcds.get(gcdfrom2);
                }
            }
            gcds.put(gcdfrom1,gcds.getOrDefault(gcdfrom1,0)+1);
        }
        return ans;
    }
    private int findgcd(int x, int y)
    {
        if(x<y)
        {
            return findgcd(y,x);
        }
        return y==0?x:findgcd(y,x%y);
    }
}