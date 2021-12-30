package toys;

public class Car {
    private final Integer serialNumber;
    
    public Car(Integer serialNumber){
        this.serialNumber=serialNumber;
    }
    
    public void pack(){
        System.out.println("Packing car: " + serialNumber);
    }
    
    public void label(){
        System.out.println("Labeling car: " + serialNumber);
    }
    
    public Integer getSerialNumber(){
        return serialNumber;
    }
}
