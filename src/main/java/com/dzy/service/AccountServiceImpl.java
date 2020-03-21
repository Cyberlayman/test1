package com.dzy.service;

import com.dzy.dao.AccountDao;
import com.dzy.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> selectAll() {
        System.out.println("业务层：查询所有...");
        return accountDao.selectAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层：保存...");
        accountDao.insert(account);
    }
}
