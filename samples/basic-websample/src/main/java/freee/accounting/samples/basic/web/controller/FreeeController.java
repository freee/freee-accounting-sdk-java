package freee.accounting.samples.basic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import freee.accounting.samples.basic.web.services.AccountingService;

@Controller
public class FreeeController {

    @Autowired
    private AccountingService _accountingService;

    @GetMapping("/user")
    public ModelAndView user() {
        return new ModelAndView("user", "user", _accountingService.getUserInfo());
    }

    @GetMapping("/companies")
    public ModelAndView companies() {
        return new ModelAndView("companies", "companies", _accountingService.getCompanies());
    }
}