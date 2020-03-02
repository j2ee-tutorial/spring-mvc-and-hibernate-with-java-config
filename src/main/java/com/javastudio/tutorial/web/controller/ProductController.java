package com.javastudio.tutorial.web.controller;

import com.javastudio.tutorial.model.Product;
import com.javastudio.tutorial.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.logging.Logger;

@RequestMapping("/product")
@Controller
public class ProductController {
    private static final Logger logger = Logger.getLogger(ProductController.class.getName());

    @Autowired
    ProductService service;

    @RequestMapping(value = "/entry", method = RequestMethod.GET)
    public String entry(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product/insert";
    }

    // @RequestMapping(value = "/entry", method = RequestMethod.GET)
    public ModelAndView entry(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("product/insert");
        view.addObject("product", new Product());
        return view;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute Product product, BindingResult validation, Model model) {
        logger.info("Saving product");
        logger.info("Name: " + product.getName());
        if (!validation.hasErrors()) {
            service.add(product);
            logger.info("Number of products: " + service.list().size());
            model.addAttribute("message", "Product saved successfully");
        } else {
            logger.warning(validation.toString());
            model.addAttribute("message", "Product is not valid. Please see the log for details.");
        }
        model.addAttribute("products", service.list());
        return "product/index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(Model model) {
        logger.info("Number of products: " + service.list().size());
        model.addAttribute("products", service.list());
        return "product/index";
    }
}
