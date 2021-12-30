package toyproducts.models;

import toyproducts.Toy;

public class AsianHelicopterToy implements Toy{

    private final Integer serialNumber;
    private final String type;

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "helicopter";
    }
    
    public Integer getSerialNumber(){
        return serialNumber;
    }

    public void pack() {
        System.out.printf("Packing %s with S/N %d \n", type, serialNumber);
    }

    public void label() {
        System.out.printf("Labeling %s with S/N %d \n", type, serialNumber);
    }

}
