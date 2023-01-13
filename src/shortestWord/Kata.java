package shortestWord;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Kata {

    public static int findShortOther(String s) {
        String[] strings = s.split(" ");
        return Arrays.stream(strings).map(string -> string.length()).min(Comparator.naturalOrder()).get();
    }

    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }

}
