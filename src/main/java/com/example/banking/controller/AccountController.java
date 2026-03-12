
package com.example.banking.controller;

import com.example.banking.model.Account;
import com.example.banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

 @Autowired
 private AccountService service;

 @GetMapping
 public List<Account> getAccounts(){
  return service.getAccounts();
 }

 @PostMapping
 public Account createAccount(@RequestBody Account account){
  return service.createAccount(account);
 }

 @DeleteMapping("/{id}")
 public void deleteAccount(@PathVariable Long id){
  service.deleteAccount(id);
 }
}
