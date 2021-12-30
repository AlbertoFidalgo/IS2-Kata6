
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.SerialNumberGenerator;

public class Main {
    
    public static void main(String[] args){
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> carArray = new ArrayList<>();
        
        System.out.println("Introduzca instruccion:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"exit".equals(input)){
            Car car = new Car(generator.next());
            car.pack();
            car.label();
            carArray.add(car);
            System.out.println("Built cars: " + 
                    carArray.stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
            
            input = scanner.nextLine();
        }
    }
}