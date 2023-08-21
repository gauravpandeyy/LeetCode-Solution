class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
      int xor=0;
        for(int i=0;i<arr1.length;i++){
            xor^=arr1[i];
        }
        int temp=0;
        for(int i=0;i<arr2.length;i++){
             temp^=arr2[i];
        }
        return xor&temp ;
    
    }
}
