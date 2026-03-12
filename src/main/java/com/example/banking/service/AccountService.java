
package com.example.banking.service;

import com.example.banking.model.Account;
import com.example.banking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

 @Autowired
 private AccountRepository repository;

 public List<Account> getAccounts(){
  return repository.findAll();
 }

 public Account createAccount(Account account){
  return repository.save(account);
 }

 public void deleteAccount(Long id){
  repository.deleteById(id);
 }
}
