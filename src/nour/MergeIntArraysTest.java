package nour;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeIntArraysTest {

 @Test
 public void testMergeIntArrays() {
  Utility util = new Utility();
  int a[] = {1,2,3,4,5};
  int b[] = {6,7,8};
  int[] result = util.mergeIntArrays(a, b);
  int[] expected = {1,2,3,4,5,6,7,8};
  assertArrayEquals(expected,result);
 }

}
