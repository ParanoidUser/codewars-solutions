interface Kata {
  static char findMissingLetter(char[] array) {
    int i = 0;
    while (array[i++] == array[i] - 1);
    return --array[i];
  }
}
