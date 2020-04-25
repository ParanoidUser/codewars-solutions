import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;
import static org.apache.commons.lang3.StringUtils.leftPad;

class BadHash {
  static String hash(String str) {
    var bin = leftPad(Integer.toBinaryString(magicNum(str)), 35, "0");
    return iterate(28, i -> i >= 0, i -> i - 7)
        .mapToObj(i -> (char) Byte.parseByte(bin.substring(i, i + 7), 2))
        .map(c -> c < 1 ? "" : c < 34 ? "!" + (char) (c + 34) : c > 125 ? "-" + (char) (c - 5) : "" + c)
        .collect(joining());
  }

  static int magicNum(String str) {
    int a = str.isEmpty() ? 0 : str.charAt(0), b = 0, c = !str.isEmpty() && str.charAt(0) == ' ' ? 2 : 1;
    for (int i = str.length() - 1; i > 0; i--) {
      a += str.charAt(i);
      b += str.charAt(i) - str.charAt(i - 1);
      c += str.charAt(i) == ' ' ? 1 : 0;
    }
    return (a | b) & (~a << 2) ^ (32 * c);
  }
}