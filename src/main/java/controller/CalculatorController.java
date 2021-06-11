package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CalculatorController {
    @GetMapping("/converts")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @PostMapping("/converts")
    public ModelAndView convert(@RequestParam int usd){
        float vnd = (float) (usd*22820.30);
        ModelAndView modelAndView = new ModelAndView("convert","vnd",vnd);
        return modelAndView;
    }

}
