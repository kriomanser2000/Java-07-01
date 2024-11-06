import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarList
{
    public static void main(String[] args)
    {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2019, 20000, "Red", 2.0));
        cars.add(new Car("Honda", 2021, 25000, "Blue", 2.5));
        cars.add(new Car("Ford", 2018, 15000, "Red", 1.6));
        cars.add(new Car("BMW", 2020, 30000, "Black", 3.0));
        cars.add(new Car("Audi", 2017, 22000, "White", 2.0));
        System.out.println("All cars: ");
        cars.forEach(System.out::println);
        String specifiedColor = "Red";
        System.out.println("\nCars of color " + specifiedColor + ":");
        cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase(specifiedColor))
                .forEach(System.out::println);
        double specifiedEngineVolume = 2.0;
        System.out.println("\nCars with engine capacity " + specifiedEngineVolume + ":");
        cars.stream()
                .filter(car -> car.getEngineVolume() == specifiedEngineVolume)
                .forEach(System.out::println);
        double specifiedPrice = 20000;
        System.out.println("\nCars are more expensive than " + specifiedPrice + ":");
        cars.stream()
                .filter(car -> car.getPrice() > specifiedPrice)
                .forEach(System.out::println);
        int minYear = 2018;
        int maxYear = 2021;
        System.out.println("\nCars manufactured between " + minYear + " і " + maxYear + " for years:");
        cars.stream()
                .filter(car -> car.getYear() >= minYear && car.getYear() <= maxYear)
                .forEach(System.out::println);
    }
}
