import java.util.LinkedList;
import java.util.List;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;
    public static String diesel = "diesel";
    public static final String petrol = "petrol";

    private static final int numberOfAxles = 4;
    private static final int numberOfWheels = 4;
    private static final int numberOfParts = numberOfAxles * numberOfWheels;


    public static List<String> ranks = new LinkedList<>();

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public static int setNumberOfParts() {
        return Car.numberOfParts;
    }

    static {
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Major");
    }

    static {
        ranks.add("Colonel");
        ranks.add("General");
    }

}