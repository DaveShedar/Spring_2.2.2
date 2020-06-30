package web.Car;


public class Car {
    private int id;
    private String model;
    private int licensePlate;

    public Car(int id, String model, int licensePlate) {
        this.id = id;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }
}
