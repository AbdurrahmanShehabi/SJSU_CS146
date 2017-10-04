import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static  void main(String[] args){
        Car honda = new Car(25,40,"Honda");
        Car toyota = new Car(16,50, "Toyota");
        Car benz = new Car(17,70,"Benz");

        System.out.printf("Minimum 0f Honda, Toyota, and Benz is %s\n", Car.minimum(honda,toyota,benz).name);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(honda);
        cars.add(toyota);
        cars.add(benz);

        CarSpeedComparator speedComparator = new CarSpeedComparator(true);
        CarTankComparator tankComparator = new CarTankComparator(true);

        Collections.sort(cars, speedComparator);
        System.out.println(cars.toString());

        Collections.sort(cars, tankComparator);
        System.out.println(cars.toString());

    }
}
