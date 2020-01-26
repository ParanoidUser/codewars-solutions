import static java.util.stream.IntStream.range;

import java.awt.Point;

class PeacefulYard {
  static boolean peacefulYard(String[] yard, int minDistance) {
    var catPoints = range(0, yard.length).boxed().flatMap(y ->
                    range(0, yard[y].length()).boxed().filter(x -> yard[x].charAt(x) != '-')
                        .map(x -> new Point(x, y))).toArray(Point[]::new);

    for (int i = 0; i < catPoints.length; i++) {
      for (int j = i + 1; j < catPoints.length; j++) {
        if (catPoints[i].distance(catPoints[j]) < minDistance) {
          return false;
        }
      }
    }
    return true;
  }
}
