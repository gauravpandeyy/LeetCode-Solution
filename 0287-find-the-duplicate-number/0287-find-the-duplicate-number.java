class Solution {
    public int findDuplicate(int[] arr) {
       int i=0;
    while(i<arr.length)
    {
        if(arr[i]!=i+1)
        {
      int crct=arr[i]-1;
      if(arr[i]!=arr[crct])
      {
        swap(arr, i, crct);
      }
      else{
return arr[i];
      }
        }
      else{
        i++;
      }
  }
  return -1;
    }
    static void swap(int[] arr,int a , int b)
{
int temp=arr[a];
  arr[a]=arr[b];
  arr[b]=temp;
}
}
