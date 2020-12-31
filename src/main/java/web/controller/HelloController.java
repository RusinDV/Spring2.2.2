package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import web.model.Car;
import web.service.CreateCars;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public ModelAndView getCars(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        int count = 0;
        try {
            count = Integer.parseInt(request.getParameter("count"));
        } catch (NumberFormatException e) {

        }
        modelAndView.setViewName("cars");
        if (count > 0 && count <= 5) {
            modelAndView.addObject("cars", CreateCars.getFiveCars(count));
            return modelAndView;
        } else {
            modelAndView.addObject("cars",CreateCars.getFiveCars(5));
            return modelAndView;
        }
    }


}