package business;

import toyproducts.Toy;

public abstract class ToyBusiness {

    private SerialNumberGenerator generator = new SerialNumberGenerator();

    public abstract Toy createToy(String type);
}
