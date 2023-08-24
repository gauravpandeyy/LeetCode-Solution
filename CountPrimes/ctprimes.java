class Solution {
    public int countPrimes(int n) {
    if(n<=2)return 0;
    boolean arr[]=new boolean[n+1];
    int ct=0;
     for (int i = 2; i<=Math.sqrt(n) ; i++) {
     if(!arr[i])
     {
     for (int j =i*i; j <n ; j+=i) {
        arr[j]=true;
      }
    }
}
for (int i=2;i<n;i++)
{
      if(!arr[i])
            {
                ct++;
            }
        }
        return ct;
    }
}
