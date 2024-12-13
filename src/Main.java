public class Main {
    public static void main(String[] args) {
        CarParking carParking = new CarParking();

        carParking.evacuateByCarNumber("ABC-10");
        carParking.evacuateByType("");
        carParking.evacuateByBrand("volvo");

        carParking.showCars();
    }
}