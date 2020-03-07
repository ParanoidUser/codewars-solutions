import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test() {
    int[] actual = new FindIndexOfSubArray(new int[] {1, 2, 3, 6, 4, 4}).findIndexOfSubArray();
    assertArrayEquals(new int[] {3, 5}, actual);
  }

  @Test
  public void test2() {
    int[] actual = new FindIndexOfSubArray(new int[] {1, 2, 3}).findIndexOfSubArray();
    assertArrayEquals(new int[] {0, 0}, actual);
  }

  @Test
  public void test3() {
    int[] actual = new FindIndexOfSubArray(new int[] {1, 1, 1}).findIndexOfSubArray();
    assertArrayEquals(new int[] {0, 0}, actual);
  }

  @Test
  public void test4() {
    int[] actual = new FindIndexOfSubArray(new int[] {1, 2, 3, 6, 5, 4}).findIndexOfSubArray();
    assertArrayEquals(new int[] {3, 5}, actual);
  }

  @Test
  public void test5() {
    int[] actual = new FindIndexOfSubArray(new int[] {6, 5, 4, 1, 2, 3}).findIndexOfSubArray();
    assertArrayEquals(new int[] {3, 5}, actual);
  }

  @Test
  public void test6() {
    int[] actual = new FindIndexOfSubArray(new int[] {9, 2, 32, 123, 3, 2, 2}).findIndexOfSubArray();
    assertArrayEquals(new int[] {0, 4}, actual);
  }

  @Test
  public void test7() {
    int[] actual = new FindIndexOfSubArray(new int[] {
            82, 77, 47, 30, 91, 45, 16, 7, 72, 21, 47, 80, 89, 75, 39, 43, 92, 80, 70, 75, 80, 69, 44, 72, 97, 12, 38, 89, 84, 48, 78, 83, 16, 68, 50, 6, 11, 44, 23, 65, 24, 25, 53, 19, 3, 87, 80, 85, 64, 70, 30, 0, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110
                }).findIndexOfSubArray();
    assertArrayEquals(new int[] {0, 51}, actual);
  }
}
