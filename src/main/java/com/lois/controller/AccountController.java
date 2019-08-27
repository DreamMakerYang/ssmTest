package com.lois.controller;

import com.lois.domain.Account;
import com.lois.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountController  {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView mv){
        System.out.println("AccountController中findAll方法执行了");
        mv.addObject("Account",accountService.findAll());
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/save")
    public String save(Account account){
        accountService.save(account);
        return "success";
    }
}
