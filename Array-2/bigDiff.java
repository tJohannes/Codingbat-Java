/* Given an array length 1 or more of ints, return the difference between the 
 * largest and smallest values in the array.
 */
 
// bigDiff([10, 3, 5, 6]) → 7
// bigDiff([7, 2, 10, 9]) → 8
// bigDiff([2, 10, 7, 2]) → 8


public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  
  for (int i = 0; i < nums.length; i++) {
    min = Math.min(min, nums[i]);
    max = Math.max(max, nums[i]);
  }
  return max - min;
}
