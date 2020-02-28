import static org.junit.Assert.*;

import org.junit.Test;

public class OpstringsTest {
  @Test
  public void testB() {
    assertEquals("weetvI\nuNhBWF\nUHiTNk\nyWflpG\nPxmFdj\nCwiIvZ", Opstrings.oper(Opstrings::diag1Sym, "wuUyPC\neNHWxw\nehifmi\ntBTlFI\nvWNpdv\nIFkGjZ"));
    assertEquals("Sixdvr\ndJNCGg\nmBWhca\nEYgZEv\nKDXVKc\nbORWle", Opstrings.oper(Opstrings::rot90Clock, "rgavce\nvGcEKl\ndChZVW\nxNWgXR\niJBYDO\nSdmEKb"));
    assertEquals("NJVGhr|NMtsrz\nMObsvw|JOPotj\ntPhCtl|VbhEQl\nsoEnhi|GsCnRi\nrtQRLK|hvthLW\nzjliWg|rwliKg", Opstrings.oper(Opstrings::selfieAndDiag1, "NJVGhr\nMObsvw\ntPhCtl\nsoEnhi\nrtQRLK\nzjliWg"));
  }
}
