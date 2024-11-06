import java.util.*;
import java.util.stream.Collectors;

class Television
{
    private String model;
    private int releaseYear;
    private double price;
    private double diagonal;
    private String manufacturer;
    public Television(String model, int releaseYear, double price, double diagonal, String manufacturer)
    {
        this.model = model;
        this.releaseYear = releaseYear;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }
    public String getModel()
    {
        return model;
    }
    public int getReleaseYear()
    {
        return releaseYear;
    }
    public double getPrice()
    {
        return price;
    }
    public double getDiagonal()
    {
        return diagonal;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    @Override
    public String toString()
    {
        return "Television{" +
                "model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
