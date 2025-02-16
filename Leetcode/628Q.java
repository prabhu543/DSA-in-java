import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        if(n == 3)
        return (nums[0] * nums[1] * nums[2]);
        else
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                nums[0] * nums[1] * nums[n - 1]); /* maximum product can be either the product of three largest numbers or the product of two smallest numbers and the largest number. We can use Math.max() value comparing built  in method  */
    }
}
public class Main
{
	public static void main(String[] args) {
	  int[] array = { 1,2,3 };
		Solution sol = new Solution();
		System.out.println("max product :" +sol.maximumProduct(array));
	}
}