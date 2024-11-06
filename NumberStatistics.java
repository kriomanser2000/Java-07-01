import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberStatistics
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new Random().ints(50, -10, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Generated nums: " + numbers);
        System.out.print("Enter num for checking: ");
        int userValue = scanner.nextInt();
        long evenCount = numbers.stream()
                .filter(num -> num != 0 && num % 2 == 0)
                .count();
        long oddCount = numbers.stream()
                .filter(num -> num % 2 != 0)
                .count();
        long zeroCount = numbers.stream()
                .filter(num -> num == 0)
                .count();
        long userValueCount = numbers.stream()
                .filter(num -> num == userValue)
                .count();
        System.out.println("Num of even nums: " + evenCount);
        System.out.println("Num of odd nums: " + oddCount);
        System.out.println("Num of zeros: " + zeroCount);
        System.out.println("The num of nums equal to " + userValue + ": " + userValueCount);
        scanner.close();
    }
}
