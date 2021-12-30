package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    
    public abstract Toy createToy(Integer serialNumber);
}
