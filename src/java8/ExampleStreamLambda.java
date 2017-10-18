package java8;

import java.util.stream.Stream;

public class ExampleStreamLambda {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1","2");
        stringStream.forEach(System.out::println);
    }
}
