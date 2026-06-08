
import java.util.*;
import java.util.stream.*;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 4, 6, 2, 8);
        // 1. stream()
        
        System.out.println("Original List:");
        nums.stream().forEach(System.out::println);

        // 2. filter()
        System.out.println("\nEven Numbers:");
        nums.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        // 3. map()
        System.out.println("\nSquare of Numbers:");
        nums.stream()
                .map(x -> x * x)
                .forEach(System.out::println);
        // 4. sorted()
      
        System.out.println("\nSorted List:");
        nums.stream()
                .sorted()
                .forEach(System.out::println);


        
        // 5. distinct()
       
        System.out.println("\nDistinct Elements:");
        nums.stream()
                .distinct()
                .forEach(System.out::println);


        
        // 6. limit()
       
        System.out.println("\nFirst 3 Elements:");
        nums.stream()
                .limit(3)
                .forEach(System.out::println);


        // 7. skip()
        
        System.out.println("\nAfter Skipping 3 Elements:");
        nums.stream()
                .skip(3)
                .forEach(System.out::println);
        // 8. count()
        // Note: count() is a terminal operation that returns a long value representing the number of elements in the stream.
        long count = nums.stream().count();
        System.out.println("\nCount = " + count);
        // 9. max()
        
        int max = nums.stream()
                .max(Integer::compare)
                .get();

        System.out.println("\nMaximum = " + max);
        // 10. min()
        
        int min = nums.stream()
                .min(Integer::compare)
                .get();

        System.out.println("Minimum = " + min);


        
        // 11. reduce()
       
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("\nSum = " + sum);


     
        // 12. collect()
        
        List<Integer> evenList = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nCollected Even List:");
        System.out.println(evenList);


        
        // 13. findFirst()
        
        Optional<Integer> first = nums.stream().findFirst();

        System.out.println("\nFirst Element = " + first.get());


        
        // 14. findAny()
        
        Optional<Integer> any = nums.stream().findAny();

        System.out.println("Any Element = " + any.get());


        
        // 15. anyMatch()
        
        boolean hasEven = nums.stream()
                .anyMatch(x -> x % 2 == 0);

        System.out.println("\nContains Even? " + hasEven);


        // 16. allMatch()        
        boolean allPositive = nums.stream()
                .allMatch(x -> x > 0);

        System.out.println("All Positive? " + allPositive);


        
        // 17. noneMatch()
        
        boolean noneNegative = nums.stream()
                .noneMatch(x -> x < 0);

        System.out.println("No Negative Numbers? " + noneNegative);


        
        // 18. forEach()
        
        System.out.println("\nUsing forEach:");
        nums.stream()
                .forEach(x -> System.out.println(x));


        
        // 19. toArray()
        
        Object[] arr = nums.stream().toArray();

        System.out.println("\nArray Elements:");
        for (Object x : arr) {
            System.out.println(x);
        }

        // 20. parallelStream()
        
        System.out.println("\nParallel Stream:");
        nums.parallelStream()
                .forEach(System.out::println);
        // 21. mapToInt()
        
        int total = nums.stream()
                .mapToInt(x -> x)
                .sum();

        System.out.println("\nTotal using mapToInt = " + total);

        // 22. sorted Reverse Order
        
        System.out.println("\nReverse Sorting:");
        nums.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        // 23. Stream.of()
        
        System.out.println("\nUsing Stream.of():");
        Stream.of(10, 20, 30, 40)
                .forEach(System.out::println);

        // 24. concat()
        
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        Stream<Integer> s2 = Stream.of(4, 5, 6);

        System.out.println("\nConcatenated Stream:");
        Stream.concat(s1, s2)
                .forEach(System.out::println);

        // 25. peek()
        
        System.out.println("\nUsing peek():");
        nums.stream()
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println("Filtered: " + x))
                .map(x -> x * x)
                .forEach(System.out::println);

        // 26. flatMap()
        
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        System.out.println("\nUsing flatMap():");
        nested.stream()
                .flatMap(x -> x.stream())
                .forEach(System.out::println);

        // 27. iterate()
        
        System.out.println("\nUsing iterate():");
        Stream.iterate(1, x -> x + 1)
                .limit(5)
                .forEach(System.out::println);

        // 28. generate()
        System.out.println("\nUsing generate():");
        Stream.generate(() -> "Java")
                .limit(3)
                .forEach(System.out::println);

        // 29. groupingBy()
        List<String> names = Arrays.asList("Ram", "Ravi", "Aman", "Ajay", "Rahul");

        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));

        System.out.println("\nGrouping By First Letter:");
        System.out.println(grouped);
        // 30. joining()
        String joined = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("\nJoined String:");
        System.out.println(joined);
    }
}


