package toys;

public class ToyBusiness {
    private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(generator.next());
        car.pack();
        car.label();
        
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(generator.next());
        helicopter.pack();
        helicopter.label();
        
        return helicopter;
    }
}
