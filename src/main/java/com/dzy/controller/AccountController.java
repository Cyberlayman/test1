package com.dzy.controller;

import com.dzy.pojo.Account;
import com.dzy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<Account> users = accountService.selectAll();
        model.addAttribute("users",users);
        return "account";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.save(account);
        response.sendRedirect(request.getContextPath()+"/account/selectAll");
    }
}
