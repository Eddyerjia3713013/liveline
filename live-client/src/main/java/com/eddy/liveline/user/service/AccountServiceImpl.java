package com.eddy.liveline.user.service;

import com.eddy.liveline.user.pojo.Account;
import com.eddy.liveline.user.dao.AccountMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

  @Resource
  private AccountMapper accountMapper;

  @Override
  public boolean save(Account account) {
    return accountMapper.save(account) > 0;
  }

  @Override
  public boolean delete(String id) {
    return accountMapper.delete(id) > 0;
  }

  @Override
  public Account get(String id) {
    return accountMapper.get(id);
  }

  @Override
  public List<Account> query() {
    return accountMapper.query();
  }

  @Override
  public boolean update(Account account) {
    return accountMapper.update(account) > 0;
  }

  @Override
  public Account getAccount(String name, String password) {
    return accountMapper.getAccount(name,password);
  }

}
