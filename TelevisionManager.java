import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TelevisionManager
{
    public static void main(String[] args)
    {
        List<Television> televisions = Arrays.asList(
                new Television("ModelA", 2024, 500.0, 32.0, "Samsung"),
                new Television("ModelB", 2023, 700.0, 40.0, "LG"),
                new Television("ModelC", 2024, 800.0, 55.0, "Sony"),
                new Television("ModelD", 2022, 300.0, 32.0, "Philips"),
                new Television("ModelE", 2023, 1000.0, 65.0, "Samsung")
        );
        System.out.println("All TVs: ");
        televisions.forEach(System.out::println);
        double targetDiagonal = 32.0;
        System.out.println("\nDiagonal TVs " + targetDiagonal + ":");
        televisions.stream()
                .filter(tv -> tv.getDiagonal() == targetDiagonal)
                .forEach(System.out::println);
        String targetManufacturer = "Samsung";
        System.out.println("\nTVs of the manufacturer " + targetManufacturer + ":");
        televisions.stream()
                .filter(tv -> tv.getManufacturer().equalsIgnoreCase(targetManufacturer))
                .forEach(System.out::println);
        int currentYear = 2024;
        System.out.println("\nTVs of the current year (" + currentYear + "):");
        televisions.stream()
                .filter(tv -> tv.getReleaseYear() == currentYear)
                .forEach(System.out::println);
        double minPrice = 600.0;
        System.out.println("\nTVs are more expensive than " + minPrice + ":");
        televisions.stream()
                .filter(tv -> tv.getPrice() > minPrice)
                .forEach(System.out::println);
        System.out.println("\nTVs sorted by price (increasing): ");
        televisions.stream()
                .sorted(Comparator.comparing(Television::getPrice))
                .forEach(System.out::println);
        System.out.println("\nTVs sorted by price (descending): ");
        televisions.stream()
                .sorted(Comparator.comparing(Television::getPrice).reversed())
                .forEach(System.out::println);
        System.out.println("\nTVs sorted diagonally (ascending): ");
        televisions.stream()
                .sorted(Comparator.comparing(Television::getDiagonal))
                .forEach(System.out::println);
        System.out.println("\nTVs sorted diagonally (descending): ");
        televisions.stream()
                .sorted(Comparator.comparing(Television::getDiagonal).reversed())
                .forEach(System.out::println);
    }
}