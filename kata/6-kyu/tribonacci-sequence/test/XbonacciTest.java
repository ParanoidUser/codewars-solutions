import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class XbonacciTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new double[] {1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, Xbonacci.tribonacci(new double[] {1, 1, 1}, 10), 1e-10);
    assertArrayEquals(new double[] {0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, Xbonacci.tribonacci(new double[] {0, 0, 1}, 10), 1e-10);
    assertArrayEquals(new double[] {0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, Xbonacci.tribonacci(new double[] {0, 1, 1}, 10), 1e-10);
  }
}