package com.controller;

import com.pojo.Gender;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class Share {

    private static final String[] countries = {"China",
            "United staetes", "Germany", "Turkey"};
    // 设置模型属性值genders
    @ModelAttribute("genders")
    public Gender[] genders() {
        return Gender.values();
    }

    // 设置模型属性值countries
    @ModelAttribute("countries")
    public String[] countries() {
        return countries;
    }
    @ExceptionHandler
    public ModelAndView handleException(UserNotFoundException e) {
        ModelAndView modelAndView = new ModelAndView("errorGlobal");
        modelAndView.addObject("erroMessage", e.getMessage());
        return modelAndView;
    }
}
