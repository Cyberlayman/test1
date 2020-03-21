package com.dzy.dao;

import com.dzy.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    @Select("select * from account")
    List<Account> selectAll();

    @Insert("insert into account (name,money) values (#{name},#{money}) ")
    void insert(Account account);
}
