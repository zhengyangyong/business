package com.picc.cms.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.picc.cms.dao.AccountInfo;
import com.picc.cms.dao.AccountMapper;

@RestSchema(schemaId = "accountEndpoint")
@RequestMapping(path = "/")
public class AccountEndpoint {
  private AccountMapper accountMapper;

  @Autowired
  public AccountEndpoint(AccountMapper accountMapper) {
    this.accountMapper = accountMapper;
  }

  @PostMapping(path = "/create")
  public void createTable(long id, double balance) {
    AccountInfo info = new AccountInfo();
    info.setUserId(id);
    info.setReserved(false);
    info.setTotalBalance(balance);
    accountMapper.createAccountInfo(info);
  }

  @GetMapping(path = "/query")
  public AccountInfo query(@RequestParam long id) {
    return accountMapper.getAccountInfo(id);
  }

  @PostMapping(path = "/update")
  public void pay(long id, double balance) {
    AccountInfo info = this.query(id);
    if (info != null) {
      info.setTotalBalance(info.getTotalBalance() - balance);
      accountMapper.updateAccountInfo(info);
    }
  }

  @DeleteMapping(path = "/clear")
  public void clearTable() {
    accountMapper.clear();
  }
}
