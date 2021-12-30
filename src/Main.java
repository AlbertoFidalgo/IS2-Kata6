
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.*;

public class Main {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<CarToy> carArray = new ArrayList<>();
        ArrayList<HelicopterToy> helicopterArray = new ArrayList<>();

        System.out.println("Introduzca instruccion:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (true) {
            switch (input) {
                case "car":
                    CarToy car = (CarToy) toyBusiness.createToy("car");
                    carArray.add(car);
                    System.out.println("Built cars: "
                            + carArray.stream()
                                    .map(c -> c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;

                case "helicopter":
                    HelicopterToy helicopter = (HelicopterToy) toyBusiness.createToy("helicopter");
                    helicopterArray.add(helicopter);
                    System.out.println("Built helicopters: "
                            + helicopterArray.stream()
                                    .map(c -> c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    exit(0);

                default:
                    System.out.println("Command unknown");
                    break;

            }
            input = scanner.nextLine();
        }
    }
}
