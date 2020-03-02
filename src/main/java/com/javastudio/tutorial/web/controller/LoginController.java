package com.javastudio.tutorial.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Controller
public class LoginController {

    Logger logger = Logger.getLogger(LoginController.class.getName());

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String entry() {
        return "login/entry";
    }

    // Traditional form
    // @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String save(HttpServletRequest request, Model model) {
        logger.info("username: " + request.getParameter("username"));
        logger.info("password: " + request.getParameter("password"));
        model.addAttribute("message", "You logged in successfully!");
        model.addAttribute("username", request.getParameter("username"));
        return "login/profile";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String save(@RequestParam String username, @RequestParam String password, Model model) {
        logger.info("username: " + username);
        logger.info("password: " + password);
        model.addAttribute("message", "You logged in successfully!");
        model.addAttribute("username", username);
        return "login/profile";
    }
}
