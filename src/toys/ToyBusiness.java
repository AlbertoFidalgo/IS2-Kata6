package toys;

import toyproducts.Toy;
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;

public class ToyBusiness {

    private SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy createToy(String type) {
        switch (type) {
            case "car":
                CarToy car = new CarToy(generator.next());
                car.pack();
                car.label();
                return car;

            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
        }
        return null;
    }
}
