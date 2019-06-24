package com.eddy.liveline.user.service;


import com.eddy.liveline.user.pojo.Account;

import java.util.List;

public interface AccountService {

  public boolean save(Account account);
  
  public boolean delete(String id);
  
  public Account get(String id);
  
  public List<Account> query();
  
  public boolean update(Account t);

  public Account getAccount(String name, String password);
}
