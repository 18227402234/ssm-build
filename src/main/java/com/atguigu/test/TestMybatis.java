package com.atguigu.test;

import com.atguigu.dao.AccountMapper;
import com.atguigu.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zxx
 * @create 2021-08-31 16:07
 */
public class TestMybatis {
    @Test
    public void test1() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        try {
            sqlSession = sessionFactory.openSession(true);
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts = accountMapper.queryAllAccount();
            for (Account account :
                    accounts) {
                System.out.println(account);
            }
        } finally {

            sqlSession.close();
        }

    }
    @Test
    public void test2() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        try {
            sqlSession = sessionFactory.openSession(true);
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Account account = new Account("大大", (double) 3000);
            accountMapper.addAccount(account);
//            List<Account> accounts = accountMapper.queryAllAccount();
//            for (Account account :
//                    accounts) {
//                System.out.println(account);
//            }
        } finally {

            sqlSession.close();
        }

    }
}
