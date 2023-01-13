package highestAndLowest;

import java.util.Arrays;
import java.util.List;

public class Kata {

    public static String highAndLow(String numbers) {
        List<Integer> list = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .toList();

        return list.get(list.size() - 1) + " " + list.get(0);
    }

}
