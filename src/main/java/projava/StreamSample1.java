package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample1 {
    public static void main(String[] args) {
        var date = List.of("yamato", "kis", "sugiyama");

        var result = date.stream().filter(s -> s.length() >= 5).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);
    }
}
