package functionalinterface.builtin;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    private static final String TEST_STRING = LocalDateTime.now().toString();

    public static void main(String[] args) {
        // play with functional interfaces

        final Predicate<String> stringNonNull = Objects::nonNull;
        System.out.println(stringNonNull.test(TEST_STRING));
        System.out.println(stringNonNull.test(null));

        final Predicate<String> stringNotEmpty = String::isEmpty;
        System.out.println(stringNotEmpty.negate().test(TEST_STRING));
        System.out.println(stringNotEmpty.negate().test(""));

        System.out.println(stringNonNull.and(stringNotEmpty).negate().test(TEST_STRING));
        System.out.println(stringNonNull.and(stringNotEmpty).negate().test(""));

        final String jane = "Lane";
        final String north = "North";
        final String key = "key";
        final Predicate<String> predicate = str -> str.startsWith("J") || str.startsWith("N") || str.endsWith("e");
        System.out.println(predicate.test(jane));
        System.out.println(predicate.test(north));
        System.out.println(predicate.test(key));

        final Consumer<Cat> consumer = cat -> System.out.println("Weight of the cat is a " + cat.getWeight() + " kg");
        consumer.andThen(cat -> System.out.println("Give me the cat with a weight " + cat.getWeight() + " kg"))
            .accept(new Cat(5));

        final Function<Integer, String> function = number -> number < 0
            ? "Negative"
            : number > 0 ? "Positive" : "Zero";
        System.out.println(function.apply(5));
        System.out.println(function.apply(0));
        System.out.println(function.apply(-2));
        System.out.println(function.apply(-3));
        System.out.println(function.apply(14));

        final Supplier<Integer> supplier = () -> new Random().nextInt(6) + 1;
        System.out.println(supplier.get());
    }
}
