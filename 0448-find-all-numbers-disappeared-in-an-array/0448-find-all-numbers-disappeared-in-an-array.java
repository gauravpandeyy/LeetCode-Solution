class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
    while(i<arr.length)
    {
      int crct=arr[i]-1;
      if(arr[i]!=arr[crct])
      {
        swap(arr, i, crct);
      }
      else{
        i++;
      }
  }
  ArrayList<Integer> lt=new ArrayList<>();
  for(int j=0;j<arr.length;j++)
  {
if(arr[j]!=j+1)
{
    lt.add(j+1);
}
  }
  return lt;
    }
    static void swap(int[] arr,int a , int b)
{
int temp=arr[a];
  arr[a]=arr[b];
  arr[b]=temp;
}
}