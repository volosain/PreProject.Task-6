package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Mercedes", "E-class", "Black"));
        list.add(new Car("BMW", "X6", "White"));
        list.add(new Car("Audi", "A6", "Red"));
        list.add(new Car("Volkswagen", "Golf", "Grey"));
        list.add(new Car("Porsche", "Cayenne", "Green"));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";

    }



}
