package com.javastudio.tutorial.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class HomeController {

    Logger logger = Logger.getLogger(HomeController.class.getName());

    @RequestMapping("/")
    public String home() {
        logger.info("Forwarding request to home page");
        return "index";
    }

}
