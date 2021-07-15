package nour;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayContainsTest {

 @Test
 public void testArrayContains() {
  Utility util = new Utility();
  int arr[] = {1, 2,3,4,5};
  boolean result = util.arrayContains(arr,4);
  assertEquals(true,result);
 }

}
