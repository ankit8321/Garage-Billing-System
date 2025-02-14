public class Car {
private String CarNumber;
private String model;

    public Car(String carNumber, String model) {
        CarNumber = carNumber;
        this.model = model;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public String getModel() {
        return model;
    }
}
