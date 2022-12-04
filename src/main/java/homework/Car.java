package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Car {
    private final int yearOfManufacture;
    private final int engineCapacity;

    Car(int yearOfManufacture, int engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static List<Car> sortByYearOfManufacture(List<Car> cars) {
        ArrayList<Car> sortedList = new ArrayList<>(cars);
        sortedList.sort(Comparator.comparingInt(Car::getYearOfManufacture));
        return sortedList;
    }
}
