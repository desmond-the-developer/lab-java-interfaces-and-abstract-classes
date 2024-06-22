import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Sedan("VIN123", "Honda", "Accord", 50000));
        cars.add(new Truck("VIN456", "Toyota", "Tacoma", 30000, 13000.0));
        cars.add(new UtilityVehicle("VIN789", "Jeep", "Wrangler", 20000, true));

        List<Video> videos = new ArrayList<>();
        videos.add(new Movie("Batman", 148, 8.8));
        videos.add(new TvSeries("Terminator", 60, 62));

        System.out.println("Car Inventory:");
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }

        System.out.println("\nVideo Inventory:");
        for (Video video : videos) {
            System.out.println(video.getInfo());
        }
    }
}
