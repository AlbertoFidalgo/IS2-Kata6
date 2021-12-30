
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import toyproducts.Toy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca rama:");
        System.out.println("1 - Rama Americana");
        System.out.println("2 - Rama Asiatica");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> carArray = new ArrayList<>();
        ArrayList<Toy> helicopterArray = new ArrayList<>();

        if (input.equals("1")) {
            toyBusiness.add("car", new AmericanCarToyFactory());
            toyBusiness.add("helicopter", new AmericanHelicopterToyFactory());
        } else if (input.equals("2")) {
            toyBusiness.add("car", new AsianCarToyFactory());
            toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        } else {
            System.out.println("Rama no existente");
            exit(0);
        }

        System.out.println("Introduzca comando:");
        input = scanner.nextLine();
        while (true) {
            switch (input) {
                case "car":
                    Toy car = toyBusiness.produceToy("car");
                    carArray.add(car);
                    System.out.println("Built cars: "
                            + carArray.stream()
                                    .map(c -> c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;

                case "helicopter":
                    Toy helicopter = toyBusiness.produceToy("helicopter");
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
