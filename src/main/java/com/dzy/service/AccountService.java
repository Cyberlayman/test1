package com.dzy.service;

import com.dzy.pojo.Account;

import java.util.List;

public interface AccountService {
    List<Account> selectAll();
    void save(Account account);
}
