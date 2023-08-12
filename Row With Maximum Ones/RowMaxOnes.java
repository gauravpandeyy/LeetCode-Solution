//https://leetcode.com/problems/row-with-maximum-ones/
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
          int sum = 0;
        int index = 0;
        int count = 0;

        for(int i=0; i<mat.length; i++){
            count = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > sum){
                sum = count;
                index = i;
            }
        }
        int[] arr ={index,sum};
        return arr;
        
    }
}
