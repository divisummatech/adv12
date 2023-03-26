package javainproduction._2;

import java.util.List;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

    /**
     * 1:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use forEach to print the selected even numbers
     *
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        import java.util.Arrays;
import java.util.List;

        public class Exercise1 {
            public static void main(String[] args) {
                List<Integer> ourNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                ourNumbers.stream()
                        .filter(number -> number % 2 == 0)
                        .forEach(System.out::println);
            }
        }

    }

    /**
     * 2:
     *
     *
     * Use filter to select only odd numbers from the list 'ourNumbers'
     *
     * Use the toSet() method to collect the selected odd numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        List<Integer> ourNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<Integer> oddNumbers = ourNumbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toSet());

        System.out.println(oddNumbers);
    }
}

    /**
     * 3:
     *
     *
     * Use map to convert the strings to uppercase
     *
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     *
     * Print the resulting Set
     *
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        alice.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }


    /**
     * 4:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use map to multiply the even numbers by 2
     *
     * Use the toSet() method to collect the resulting numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        List<Integer> ourNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<Integer> result = ourNumbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}