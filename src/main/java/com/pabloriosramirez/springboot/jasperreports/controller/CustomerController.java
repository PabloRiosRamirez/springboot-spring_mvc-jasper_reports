/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
 *
 */

package com.pabloriosramirez.springboot.jasperreports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.pabloriosramirez.springboot.jasperreports.service.ICustomerService;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/")
    public ModelAndView verInicio() {
        return new ModelAndView("customer");
    }

    @RequestMapping("/report")
    public String verReporte(Model model,
            @RequestParam(
                    name = "format",
                    defaultValue = "pdf",
                    required = false) String format) {

        model.addAttribute("format", format);
        model.addAttribute("datasource", customerService.findAll());
        model.addAttribute("AUTOR", "Pablo Ríos Ramírez");

        return "customer_report";
    }
}
