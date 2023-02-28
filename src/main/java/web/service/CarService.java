package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
