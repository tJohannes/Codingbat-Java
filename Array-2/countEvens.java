/* Return the number of even ints in the given array.
 */
 
// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0


public int countEvens(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      count++;
    }
  }
  return count;
}
