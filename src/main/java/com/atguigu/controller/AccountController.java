package com.atguigu.controller;

import com.atguigu.dao.AccountMapper;
import com.atguigu.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zxx
 * @create 2021-08-31 15:38
 */
@Controller
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("/account/test")
    public String testQuery(Model model) {
        List<Account> accounts = accountMapper.queryAllAccount();
        model.addAttribute("accounts", accounts);
        return "list";
    }

    @RequestMapping("/account/save")
    public String testSave(Account account) {
        accountMapper.addAccount(account);
        return "forward:/account/test";
    }
}
