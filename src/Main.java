
import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.models.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca rama:");
        System.out.println("1 - Rama Americana");
        System.out.println("2 - Rama Asiatica");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("Introduzca comando:");
            input = scanner.nextLine();
            AmericanToyBusiness toyBusiness = new AmericanToyBusiness();
            ArrayList<AmericanCarToy> carArray = new ArrayList<>();
            ArrayList<AmericanHelicopterToy> helicopterArray = new ArrayList<>();
            while (true) {
                switch (input) {
                    case "car":
                        AmericanCarToy car = (AmericanCarToy) toyBusiness.createToy("car");
                        carArray.add(car);
                        System.out.println("Built cars: "
                                + carArray.stream()
                                        .map(c -> c.getSerialNumber().toString())
                                        .collect(Collectors.joining(", ")));
                        break;

                    case "helicopter":
                        AmericanHelicopterToy helicopter = (AmericanHelicopterToy) toyBusiness.createToy("helicopter");
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
        } else if (input.equals("2")) {
            System.out.println("Introduzca comando:");
            input = scanner.nextLine();
            AsianToyBusiness toyBusiness = new AsianToyBusiness();
            ArrayList<AsianCarToy> carArray = new ArrayList<>();
            ArrayList<AsianHelicopterToy> helicopterArray = new ArrayList<>();
            while (true) {
                switch (input) {
                    case "car":
                        AsianCarToy car = (AsianCarToy) toyBusiness.createToy("car");
                        carArray.add(car);
                        System.out.println("Built cars: "
                                + carArray.stream()
                                        .map(c -> c.getSerialNumber().toString())
                                        .collect(Collectors.joining(", ")));
                        break;

                    case "helicopter":
                        AsianHelicopterToy helicopter = (AsianHelicopterToy) toyBusiness.createToy("helicopter");
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
        } else {
            System.out.println("Rama desconocida");
            exit(0);
        }
    }
}
