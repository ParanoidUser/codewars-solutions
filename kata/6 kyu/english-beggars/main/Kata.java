class Kata {
  static int[] beggars(int[] values, int n) {
    int[] result = new int[n];
    for (int i = 0; n > 0 && i < values.length; i++) {
      result[i % n] += values[i];
    }
    return result;
  }
}
