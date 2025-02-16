class Solution {
  public int getMinDistance(int[] nums, int target, int start) {
    int minNum = Integer.MAX_VALUE; // initializing maximum integer value
      
    for(int i = 0 ;i<nums.length ; i++)
        if(nums[i] == target)
            minNum = Math.min(minNum , Math.abs(i - start)); // to comparing to get minimum values

  return minNum;
  }
}

public class Main
{
  public static void main(String[] args) {
    
    int[] nums = { 1,2,3,4,5 };
    int target = 5, start = 3;
    
    Solution sol = new Solution();
    System.out.println(sol.getMinDistance(nums,target,start));
  }
}