class Solution {
    public int missingNumber(int[] arr) {
  int i=0;
    while(i<arr.length)
    {
      int crct=arr[i];
      if( arr[i]<arr.length&&arr[i]!=arr[crct])
      {
        swap(arr, i, crct);
      }
      else{
        i++;
      }
  }
  for(int j=0;j<arr.length;j++)
  {
      if(arr[j]!=j)
      {
          return j;
      }
  }
  return arr.length;
    }
static void swap(int[] arr,int a , int b)
{
int temp=arr[a];
  arr[a]=arr[b];
  arr[b]=temp;
}

}