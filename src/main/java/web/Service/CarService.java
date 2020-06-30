package web.Service;

import org.springframework.stereotype.Component;
import web.Car.Car;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class CarService {
    Car car1 = new Car(1, "Volga", 314);
    Car car2 = new Car(2, "Lada", 576);
    Car car3 = new Car(3, "Pobeda", 289);
    Car car4 = new Car(4, "Moskvich", 937);
    private ArrayList<Car> list = new ArrayList<Car>(Arrays.asList(car1, car2, car3, car4));

    public ArrayList<Car> getList() {
        return list;
    }

    public void setList(ArrayList<Car> list) {
        this.list = list;
    }
}
