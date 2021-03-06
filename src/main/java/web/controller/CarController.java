package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCarsPage(Model model){
        model.addAttribute("cars", carService.getList());
        return "car-list";
    }
}
