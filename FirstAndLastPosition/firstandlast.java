//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int[] searchRange(int[] arr, int target) {
      int[] result = new int[2];
    result[0] = findfirst(arr, target);
    result[1] = findlast(arr, target);
    return result;
        
        
    }
    
    static int findfirst(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int possibleans = -1;
        while (s<=e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                possibleans = m;
                e = m - 1;
            }
            if (target > arr[m]) {
                s = m + 1;
            }
            if (target < arr[m]) {
                e = m - 1;
            }
        }
        return possibleans;

    }

    static int findlast(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1 ;
        int possibleans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                possibleans = m;
                s = m + 1;
            }
            if (target > arr[m]) {
                s = m + 1;
            }
            if (target < arr[m]) {
                e = m - 1;
            }
        }
        return possibleans;

    }
}
