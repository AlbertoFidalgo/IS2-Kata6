package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
}
