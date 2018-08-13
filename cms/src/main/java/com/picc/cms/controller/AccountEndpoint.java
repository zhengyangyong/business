package com.picc.cms.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping(path = "/query")
  public AccountInfo query(@RequestParam long id) {
    return accountMapper.getAccountInfo(id);
  }
}
