package com.lexibakes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // loads index.html from templates/
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";   // loads menu.html from templates/
    }

    // You can add more like this later:
    // @GetMapping("/order")
    // public String order() {
    //     return "order";
    // }

    // @GetMapping("/about")
    // public String about() {
    //     return "about";
    // }
}