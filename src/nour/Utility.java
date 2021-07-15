package nour;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utility {

 /**
  * This method formats a real number
  * @param n
  * @return formatted
  */
 public String format(Number n) {
  NumberFormat format = DecimalFormat.getInstance();
  format.setRoundingMode(RoundingMode.FLOOR);
  format.setMinimumFractionDigits(0);
  format.setMaximumFractionDigits(2);
  return format.format(n);
 }

 /**
  * This method checks if an int array contains an int element
  *
  * @param arr the int array
  * @param e the element
  * @return boolean true or false
  */
 public boolean arrayContains(int[] arr, int e){
  for(int i = 0; i < arr.length; i++){
   if(arr[i] == e)
    return true;
  }
  return false;
 }

 /**
  * Merges two int arrays
  * @param a int array 1
  * @param b int array 2
  * @return c new array
  */
 public int[] mergeIntArrays(int[] a, int[] b) {
  int aLen = a.length;
  int bLen = b.length;
  int[] c = new int[aLen+bLen];
  System.arraycopy(a, 0, c, 0, aLen);
  System.arraycopy(b, 0, c, aLen, bLen);
  return c;
 }

}
