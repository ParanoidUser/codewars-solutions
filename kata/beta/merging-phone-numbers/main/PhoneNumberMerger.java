import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;

import java.util.List;

class PhoneNumberMerger {
  static List<PhoneNumber> merge(List<PhoneNumber> oldNumbers, List<PhoneNumber> newNumbers) {
    return concat(newNumbers.stream(), oldNumbers.stream().filter(o -> newNumbers.stream().noneMatch(n -> n.type.equals(o.type)))).collect(toList());
  }

  static class PhoneNumber {
    final String type;
    final String number;

    PhoneNumber(String type, String number) {
      this.type = type;
      this.number = number;
    }
  }
}