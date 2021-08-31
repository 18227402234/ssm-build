package com.atguigu.service;

import com.atguigu.pojo.Account;

import java.util.List;

/**
 * @author zxx
 * @create 2021-08-31 14:49
 */
public interface AccountService {
    public Integer addAccount(Account account);

    public Integer deleteAccountById(Integer id);

    public Integer updateAccount(Account account);

    public Account queryAccountById(Integer id);

    public List<Account> queryAllAccount();
}
