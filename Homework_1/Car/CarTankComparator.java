import java.util.Comparator;

public class CarTankComparator implements Comparator<Car> {

    private int direction;

    public CarTankComparator(boolean ascending){
        if(ascending)
            direction = 1;
        else
            direction = -1;
    }

    @Override
    public int compare(Car c1, Car c2) {

        if(c1.tank == c2.tank){
            return 0;
        }
        else if(c1.tank < c2.tank){
            return -1;
        }
        else{
            return 1;
        }
    }
}
