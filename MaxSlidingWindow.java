//https://leetcode.com/problems/sliding-window-maximum/description/
/*Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

 9 3
1 2 3 1 4 5 2 3 6
 */

import java.util.Arrays;

class MaxSlidingWindow {
  public int[] maxSlidingWindow(int[] nums, int k) {

      int n=nums.length;
      int res[]=new int[n-k+1];
      Deque<Integer>deque=new LinkedList<>();

      for(int i=0;i<k;i++){
          while(!deque.isEmpty() && nums[i]>=nums
[deque.peekLast()])
            deque.removeLast();
            deque.addLast(i);
      }

      int j=0;
      for(int i=k;i<n;i++){
          res[j]=nums[deque.peek()];
          while(!deque.isEmpty() && deque.peek()<i-k+1)
            deque.removeFirst();

         while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()])
           deque.removeLast();
           deque.addLast(i);
          
        j++;
      }
       res[j]=nums[deque.peek()];
       return res;
    }

}
