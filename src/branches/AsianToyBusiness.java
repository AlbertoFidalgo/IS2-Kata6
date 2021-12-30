package branches;

import business.SerialNumberGenerator;
import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

    private SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy createToy(String type) {
        switch (type) {
            case "car":
                AsianCarToy car = new AsianCarToy(generator.next());
                car.pack();
                car.label();
                return car;

            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
        }
        return null;
    }
}
