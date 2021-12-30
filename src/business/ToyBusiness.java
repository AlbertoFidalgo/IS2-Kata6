package business;

import factories.ToyFactory;
import toyproducts.Toy;

public class ToyBusiness {
    ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        Toy toy = toyFactory.createToy(type);
        return toy;
    }
}
