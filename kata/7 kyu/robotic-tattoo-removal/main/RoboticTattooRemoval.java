import static java.util.stream.Stream.of;

class RoboticTattooRemoval {
  static String[][] robot(String[][] skinScan) {
    return of(skinScan).map(l -> String.join("", l).replace("X", "*").split("")).toArray(String[][]::new);
  }
}
