import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FrameTest {
    @Test
    public void exampleTests() {
      String score = "24-79(72); 16-101(53); 86(58)-27; 31-90(74); 0-115(115); 67-40; 61-21; 81(55)-23; 51-14; 124(56,68)-4; 67-12; 108(85)-15; 1-117(117); 1-92(92); 130(112)-0; 1-106(53); 59-39";
      assertArrayEquals("Ronnie O'Sullivan won Masters 2017!", new int[] {10, 7}, Frame.frame(score));
    }
}
