package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class ToyBusiness {
    Map<String, ToyFactory> toyFactories;
    SerialNumberGenerator generator;

    public ToyBusiness() {
        this.toyFactories = new HashMap<String, ToyFactory>();
        this.generator = new SerialNumberGenerator();
    }
    
    public Toy produceToy(String type){
        ToyFactory toyFactory = toyFactories.get(type);
        Toy toy = toyFactory.createToy(generator.next());
        return toy;
    }
    
    public void add(String name, ToyFactory toyFactory){
        toyFactories.put(name, toyFactory);
    }
}
