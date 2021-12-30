package branches;

import business.SerialNumberGenerator;
import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{

    private SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy createToy(String type) {
        switch (type) {
            case "car":
                AmericanCarToy car = new AmericanCarToy(generator.next());
                car.pack();
                car.label();
                return car;

            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
        }
        return null;
    }
}
