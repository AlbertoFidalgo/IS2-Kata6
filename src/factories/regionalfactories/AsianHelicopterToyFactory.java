package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{
    
    public Toy createToy(Integer serialNumber){
        AsianHelicopterToy toy = new AsianHelicopterToy(serialNumber);
        toy.pack();
        toy.label();
        
        return toy;
    }
}
