package com.atguigu.dao;

import com.atguigu.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zxx
 * @create 2021-08-31 14:28
 */
@Repository
public interface AccountMapper {
    public Integer addAccount(Account account);

    public Integer deleteAccountById(Integer id);

    public Integer updateAccount(Account account);

    public Account queryAccountById(Integer id);

    public List<Account> queryAllAccount();
}
