import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car>{

    private int direction;

    public CarSpeedComparator(boolean ascending){
        if(ascending)
            direction = 1;
        else
            direction = -1;
    }

    @Override
    public int compare(Car c1, Car c2) {

        if(c1.speed == c2.speed){
            return 0;
        }
        else if(c1.speed < c2.speed){
            return -1;
        }
        else{
            return 1;
        }
    }

}
