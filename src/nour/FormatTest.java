package nour;

import static org.junit.Assert.*;

import org.junit.Test;
public class FormatTest {

 @Test
 public void testFormat() {
  Utility util = new Utility();
  String result = util.format(13.55604);
  assertEquals("13.55",result);
 }

}
