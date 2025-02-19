# [Only UNChecked Exceptions](https://www.codewars.com/kata/only-unchecked-exceptions "https://www.codewars.com/kata/63cb9cea93b0b41e12bb0845")

Your objective here is to actually implement the doThrow method and be able to throw
a [SQLException](https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html).

If you learned the documentation you've heard of checked exceptions, but what if I told you there's
only unchecked exceptions in the JVM and that you can bypass the "unreported exception message"?

PS: Lombok has sneakyThrows to accomplish just that, so that would be another option to accomplish
the same, however, since it has been disabled in codewars you won't pass kata by using it though

PSPS: don't waste your time using throws in the method signature