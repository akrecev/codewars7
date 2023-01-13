package reverseWords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {

    public static String reverseWords(final String original) {
        return original.isBlank() ? original : Stream.of(original.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.joining(" "));
    }

}
