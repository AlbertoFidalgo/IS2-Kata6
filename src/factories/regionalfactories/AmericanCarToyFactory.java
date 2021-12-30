package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{
    
    public Toy createToy(Integer serialNumber){
        AmericanCarToy toy = new AmericanCarToy(serialNumber);
        toy.pack();
        toy.label();
        
        return toy;
    }
}
