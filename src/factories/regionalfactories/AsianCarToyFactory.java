package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;

public class AsianCarToyFactory extends ToyFactory{
    
    public Toy createToy(Integer serialNumber){
        AsianCarToy toy = new AsianCarToy(serialNumber);
        toy.pack();
        toy.label();
        
        return toy;
    }
}