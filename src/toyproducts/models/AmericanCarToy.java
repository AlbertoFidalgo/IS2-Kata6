package toyproducts.models;

import toyproducts.Toy;

public class AmericanCarToy implements Toy{

    private final Integer serialNumber;
    private final String type;

    public AmericanCarToy(Integer serialNumber) {
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
