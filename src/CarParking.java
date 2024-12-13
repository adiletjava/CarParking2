import java.util.ArrayList;
import java.util.List;

public class CarParking {
    private List<Car> cars;
    private List<CarParkingZone> carParkingZones;

    public CarParking() {
        cars = new ArrayList<>();
        listOfCars();
        carParkingZones = new ArrayList<>();
        listOfCarParkingZones();
    }

    private void listOfCars() {
        cars.add(new Car("ABC-01", "coupe", "chevrolet"));
        cars.add(new Car("ABC-02", "truck", "volvo"));
        cars.add(new Car("ABC-03", "sedan", "subaru"));
        cars.add(new Car("ABC-04", "SUV", "cadillac"));
        cars.add(new Car("ABC-05", "crossover", "chery"));
        cars.add(new Car("ABC-06", "public", "mercedes"));
        cars.add(new Car("ABC-07", "truck", "volvo"));
        cars.add(new Car("ABC-08", "coupe", "chevrolet"));
        cars.add(new Car("ABC-09", "sedan", "fiat"));
        cars.add(new Car("ABC-10", "hatchback", "honda"));
        cars.add(new Car("ABC-11", "sedan", "ford"));
        cars.add(new Car("ABC-12", "coupe", "chevrolet"));
        cars.add(new Car("ABC-13", "truck", "volvo"));
        cars.add(new Car("ABC-14", "sedan", "subaru"));
        cars.add(new Car("ABC-15", "public", "mercedes"));
        cars.add(new Car("ABC-16", "sedan", "fiat"));
        cars.add(new Car("ABC-17", "truck", "volvo"));
        cars.add(new Car("ABC-18", "public", "mercedes"));
        cars.add(new Car("ABC-19", "sedan", "hyundai"));
        cars.add(new Car("ABC-20", "pickup", "ford"));
        // компания BMW арендует 19 парковочных мест
        cars.add(new Car("ABC-21", "sedan", "BMW"));
        cars.add(new Car("ABC-22", "sedan", "BMW"));
        cars.add(new Car("ABC-23", "sedan", "BMW"));
        cars.add(new Car("ABC-24", "sedan", "BMW"));
        cars.add(new Car("ABC-25", "sedan", "BMW"));
        cars.add(new Car("ABC-26", "sedan", "BMW"));
        cars.add(new Car("ABC-27", "sedan", "BMW"));
        cars.add(new Car("ABC-28", "sedan", "BMW"));
        cars.add(new Car("ABC-29", "sedan", "BMW"));
        cars.add(new Car("ABC-30", "sedan", "BMW"));
        cars.add(new Car("ABC-31", "sedan", "BMW"));
        cars.add(new Car("ABC-32", "sedan", "BMW"));
        cars.add(new Car("ABC-33", "sedan", "BMW"));
        cars.add(new Car("ABC-34", "sedan", "BMW"));
        cars.add(new Car("ABC-35", "motorcycle", "BMW"));
        cars.add(new Car("ABC-36", "motorcycle", "BMW"));
        cars.add(new Car("ABC-37", "motorcycle", "BMW"));
        cars.add(new Car("ABC-38", "motorcycle", "BMW"));
        cars.add(new Car("ABC-39", "motorcycle", "BMW"));
    }

    private void listOfCarParkingZones() {
        carParkingZones.add(new CarParkingZone("Легковые"));
        carParkingZones.add(new CarParkingZone("Грузовики"));
        carParkingZones.add(new CarParkingZone("Мотоциклы"));
        carParkingZones.add(new CarParkingZone("Общест. транспорт"));
    }

    private void addCarToParkingZone(Car car) {
        String type = car.getType().toLowerCase();
        if (type.contains("sedan")) {
            carParkingZones.get(0).addCar(car);
        } else if (type.equals("public")) {
            carParkingZones.get(1).addCar(car);
        } else if (type.equals("motorcycle")) {
            carParkingZones.get(2).addCar(car);
        } else if (type.equals("truck")) {
            carParkingZones.get(3).addCar(car);
        }

        public void evacuateByCarNumber (String carNumber){
            for (CarParkingZone zone : carParkingZones) {
                for (Car car : zone.getCars())
                    if (car.getCarNumber().equalsIgnoreCase(carNumber)) {
                        System.out.println("Эвакуация автомобиля: " + car);
                        return;
                    }
            }
            System.out.println("Автомобиль с госномером " + carNumber + " не найден.");
        }

        public void evacuateByType (String type){
            boolean found = false;
            for (Car car : cars) {
                if (car.getType().equalsIgnoreCase(type)) {
                    System.out.println("Эвакуация автомобиля: " + car);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Автомобили типа " + type + " не найдены.");
            }
        }

        public void evacuateByBrand (String brand){
            boolean found = false;
            for (Car car : cars) {
                if (car.getBrand().equalsIgnoreCase(brand)) {
                    System.out.println("Эвакуация автомобиля: " + car);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Автомобили бренда " + brand + " не найдены.");
            }
        }


        public void showCars () {
            System.out.println("Оставшиеся автомобили на парковке:");
            if (cars.isEmpty()) {
                System.out.println("Парковка пуста.");
            } else {
                for (Car car : cars) {
                    System.out.println(car);
                }
            }
        }
    }
}
