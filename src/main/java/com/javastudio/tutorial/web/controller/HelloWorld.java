package com.javastudio.tutorial.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
        String message = "<h1>Hello world!</h1>";
        return new ModelAndView("welcome", "message", message);
    }

    @RequestMapping(value = "/welcome1", method = RequestMethod.GET)
    public ModelAndView welcome1() {

        ModelAndView view = new ModelAndView("welcome");

        String message = "<h1>Hello world!</h1>";
        view.addObject("message", message);
        return view;
    }
}
