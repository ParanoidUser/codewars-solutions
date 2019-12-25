import static java.util.stream.Stream.of;

import java.util.Arrays;

class Sid {
  static int sumOfElements(int[][] matrix) {
    return of(matrix).flatMapToInt(Arrays::stream).sum();
  }
}
