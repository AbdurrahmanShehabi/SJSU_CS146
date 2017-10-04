
public class Car implements Comparable<Car> {

    int tank;
    int speed;
    String name;

    public Car(int tank, int speed, String name){
        this.tank = tank;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public int compareTo(Car car) {
        if(this.tank == car.tank){
            return 0;
        }
        else if(this.tank < car.tank){
            return -1;
        }
        else{
            return 1;
        }
    }

    public static <T extends Comparable<T>> T minimum(T x, T y,T z){
        T min = x;

        if (y.compareTo(min) < 0)
            min = y;
        if (z.compareTo(min) < 0)
            min = z;
        return min;
    }

    @Override
    public String toString() {
        return name;
    }

}
