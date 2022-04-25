package projava;

import java.util.List;
import java.util.stream.IntStream;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiyama");

        var result = (int) data.stream().filter(s -> s.length() >= 5).count();
        System.out.println(result);

        var nums = new int[]{2, 3, 5};
        System.out.println(IntStream.of(nums).sum());
        System.out.println(IntStream.range(0, 10).toArray());
        System.out.println(IntStream.rangeClosed(0, 10).toArray());

    }
}

