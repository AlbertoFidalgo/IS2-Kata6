package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory{
    
    public Toy createToy(Integer serialNumber){
        AmericanHelicopterToy toy = new AmericanHelicopterToy(serialNumber);
        toy.pack();
        toy.label();
        
        return toy;
    }
}
