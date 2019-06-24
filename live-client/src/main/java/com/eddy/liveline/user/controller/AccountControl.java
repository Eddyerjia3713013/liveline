package com.eddy.liveline.user.controller;

import com.eddy.liveline.user.pojo.Account;
import com.eddy.liveline.user.service.AccountService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class AccountControl {

  private Logger logger = LogManager.getLogger(this.getClass());
  
  @Resource
  private AccountService accountService;
  
  @RequestMapping(value = {"/get"})
  public Account get(HttpServletRequest request){
    return (Account) request.getSession().getAttribute("account");
  }
  
//  @FormToken(produce = true)
  @RequestMapping(value = {"/list"})
  public List<Account> convertPage(@ModelAttribute Account account, Model model, HttpServletRequest request) {
//    MessageEntity.Builder builder = new MessageEntity.Builder(request);
    List<Account> query = accountService.query();
    return query;
  }
  
}
