package toys;

public class Helicopter {

    private final Integer serialNumber;
    private final String type;

    public Helicopter(Integer serialNumber) {
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
