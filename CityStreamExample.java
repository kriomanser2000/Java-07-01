import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CityStreamExample
{
    public static void main(String[] args)
    {
        List<String> cities = Arrays.asList(
                "Kryvyi Rih", "Lviv", "Odesa", "Dnipro", "Kharkiv",
                "Kryvyi Rih", "Lviv", "Zaporizhzhia", "Vinnytsia", "Lutsk");
        System.out.println("All cities: ");
        cities.stream()
                .forEach(System.out::println);
        System.out.println("\nCities with a length more than six characters: ");
        cities.stream()
                .filter(city -> city.length() > 6)
                .distinct()
                .forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter city name to count: ");
        String inputCity = scanner.nextLine();
        long count = cities.stream()
                .filter(city -> city.equalsIgnoreCase(inputCity))
                .count();
        System.out.println("City \"" + inputCity + "\" occurs " + count + " time(s0.");
        System.out.print("\nEnter letter to count cities: ");
        String inputLetter = scanner.nextLine();
        long countByLetter = cities.stream()
                .filter(city -> city.startsWith(inputLetter))
                .count();
        System.out.println("Num of cities starting with \"" + inputLetter + "\": " + countByLetter);
    }
}
