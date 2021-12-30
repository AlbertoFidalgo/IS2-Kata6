
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.*;

public class Main {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Car> carArray = new ArrayList<>();
        ArrayList<Helicopter> helicopterArray = new ArrayList<>();

        System.out.println("Introduzca instruccion:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (true) {
            switch (input) {
                case "car":
                    Car car = toyBusiness.createCar();
                    carArray.add(car);
                    System.out.println("Built cars: "
                            + carArray.stream()
                                    .map(c -> c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;

                case "helicopter":
                    Helicopter helicopter = toyBusiness.createHelicopter();
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
