import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;

interface Strange {
  static int mathematics(int n, int k) {
    return rangeClosed(0, n).mapToObj(i -> i + "").sorted().collect(toList()).indexOf(k + "");
  }
}