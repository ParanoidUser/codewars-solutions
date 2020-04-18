class ZebulansNightmare {
  static String zebulansNightmare(String functionName) {
    String[] words = functionName.split("_");
    for (int i = 1; i < words.length; i++) {
      words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
    }
    return String.join("", words);
  }
}