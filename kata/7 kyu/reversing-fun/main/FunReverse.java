class FunReverse {
  static String funReverse(String s) {
    for (int i = 0; i < s.length() - 1; i++) {
      s = s.substring(0, i) + new StringBuilder(s.substring(i)).reverse().toString();
    }
    return s;
  }
}
