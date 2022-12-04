package homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarTest {
    static List<Car> cars = new ArrayList<>();

    @BeforeAll
    public static void init(){
        cars.add(new Car(1999, 140));
        cars.add(new Car(1997, 130));
        cars.add(new Car(2011,135));
    }

    @Test
    void shouldSortByYearOfManufacture() {
        List<Car> sortedCars = Car.sortByYearOfManufacture(cars);
        assertThat(sortedCars.get(0).getYearOfManufacture()).isEqualTo(1997);
    }

    @Test
    void shouldSortByEngine() {
        TreeSet<Car> sortedCars = new TreeSet<>(Comparator.comparingInt(Car::getEngineCapacity));
        sortedCars.addAll(cars);
        assertThat(sortedCars.first().getEngineCapacity()).isEqualTo(130);
    }

}