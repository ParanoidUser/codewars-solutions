import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Dinglemouse.same("abc", "abc"));
    assertFalse(Dinglemouse.same("abc", "def"));
  }
}