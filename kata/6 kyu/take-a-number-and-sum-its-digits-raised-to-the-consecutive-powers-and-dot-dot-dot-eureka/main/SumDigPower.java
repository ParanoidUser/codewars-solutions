import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static java.util.stream.LongStream.rangeClosed;

import java.util.List;

class SumDigPower {
  public static List<Long> sumDigPow(long a, long b) {
    return rangeClosed(a, b).filter(i -> range(0, (i + "").length())
                            .mapToDouble(j -> Math.pow((i + "").charAt(j) - 48, j + 1)).sum() == i)
                            .boxed().collect(toList());
  }
}
