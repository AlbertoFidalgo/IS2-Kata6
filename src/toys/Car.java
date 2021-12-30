package toys;

public class Car {

    private final Integer serialNumber;
    private final String type;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "car";
    }

    public String getType() {
        return type;
    }

    public void pack() {
        System.out.printf("Packing %s with S/N %d \n", type, serialNumber);
    }

    public void label() {
        System.out.printf("Labeling %s with S/N %d \n", type, serialNumber);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
}
