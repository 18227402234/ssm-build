package com.atguigu.service.serviceImpl;

import com.atguigu.dao.AccountMapper;
import com.atguigu.pojo.Account;
import com.atguigu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxx
 * @create 2021-08-31 14:50
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Integer addAccount(Account account) {
        return accountMapper.addAccount(account);
    }

    @Override
    public Integer deleteAccountById(Integer id) {
        return accountMapper.deleteAccountById(id);
    }

    @Override
    public Integer updateAccount(Account account) {
        return accountMapper.updateAccount(account);
    }

    @Override
    public Account queryAccountById(Integer id) {
        return accountMapper.queryAccountById(id);
    }

    @Override
    public List<Account> queryAllAccount() {
        return accountMapper.queryAllAccount();
    }
}
