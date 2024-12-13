import java.util.ArrayList;
import java.util.List;

public class CarParkingZone {
    private String zoneName;
    private List<Car> cars;

    public CarParkingZone(String zoneName) {
        this.zoneName = zoneName;
        this.cars = new ArrayList<>();
    }

    public String getZoneName() {
        return zoneName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public boolean containsCar(Car car) {
        return cars.contains(car);
    }


    public void showZones() {
        System.out.println("Зона: " + zoneName);
        if (cars.isEmpty()) {
            System.out.println("Парковка пуста.");
        } else {
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }
}
