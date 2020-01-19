import static java.util.Arrays.stream;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

import java.util.DoubleSummaryStatistics;

class Stats {
  static double[][] getMinAvgMax(int discard, double[][] data) {
    var summary = new DoubleSummaryStatistics();
    var stats = stream(data).map(a -> stream(a).limit(a.length - discard).skip(discard).summaryStatistics()).peek(summary::combine);
    return concat(stats, of(summary)).map(s -> new double[] {s.getMin(), s.getAverage(), s.getMax()}).toArray(double[][]::new);
  }
}
