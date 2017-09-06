/* Given a string, return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.
 */
 
// doubleX("axxbb") → true
// doubleX("axaxax") → false
// doubleX("xxxxx") → true

boolean doubleX(String str) {
  for (int i = 0; i < str.length() - 1; i++) {
    if (str.charAt(i) == 'x') {
      if (str.charAt(i + 1) == 'x') 
        return true;
        else 
        return false;
        }
  }
  return false;
}

// Alternative solution

boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) {
    return false;
  }
  if (i + 1 >= str.length()) {
    return false;
  }
  return str.substring(i+1, i+2).equals("x");
}
