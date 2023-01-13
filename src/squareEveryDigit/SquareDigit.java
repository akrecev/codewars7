package squareEveryDigit;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {

    public static int squareDigits(int n) {
        String[] split = String.valueOf(n).split("");
        String string =  Arrays.stream(split)
                .map(s -> Integer.parseInt(s))
                .map(i -> i * i)
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(string);
    }

}
