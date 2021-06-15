interface EasyBal {
  static String balance(String book) {
    var lines = book.replaceAll("[^\\w\n. ]", "").split("\n");
    var report = new StringBuilder("Original Balance: " + lines[0] + (book = "\\r\\n"));
    double balance = Double.parseDouble(lines[0]), sum = 0;
    for (var i = 1; i < lines.length; i++) {
      sum += Double.parseDouble(lines[i].split("\\s+")[2]);
      report.append(lines[i].trim().replaceAll("\\s+", " ")).append(String.format(" Balance %.2f", balance - sum)).append(book);
    }
    return report + String.format("Total expense  %.2f%sAverage expense  %.2f", sum, book, sum / (lines.length - 1));
  }
}