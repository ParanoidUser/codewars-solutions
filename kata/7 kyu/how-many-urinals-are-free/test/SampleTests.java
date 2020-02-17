import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {
  @Test
  public void sampleTests_Valid() {
    assertEquals(1, FreeUrinals.getFreeUrinals("10001"));
    assertEquals(0, FreeUrinals.getFreeUrinals("1001"));
    assertEquals(3, FreeUrinals.getFreeUrinals("00000"));
    assertEquals(2, FreeUrinals.getFreeUrinals("0000"));
    assertEquals(1, FreeUrinals.getFreeUrinals("01000"));
    assertEquals(1, FreeUrinals.getFreeUrinals("00010"));
    assertEquals(2, FreeUrinals.getFreeUrinals("10000"));
    assertEquals(0, FreeUrinals.getFreeUrinals("1"));
    assertEquals(1, FreeUrinals.getFreeUrinals("0"));
    assertEquals(0, FreeUrinals.getFreeUrinals("10"));
  }

  @Test
  public void sampleTests_False() {
    assertEquals(-1, FreeUrinals.getFreeUrinals("110"));
    assertEquals(-1, FreeUrinals.getFreeUrinals("101100001"));
  }
}
