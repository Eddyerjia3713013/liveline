package com.eddy.liveline.user.dao;

import com.eddy.liveline.user.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountMapper{

  int save(Account account);

  int delete(@Param("id") String id);

  Account get(@Param("id") String id);

  List<Account> query();

  int update(Account account);

  Account getAccount(@Param("name") String name, @Param("password") String password);


}
