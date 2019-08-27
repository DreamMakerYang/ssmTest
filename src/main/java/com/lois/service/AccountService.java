package com.lois.service;

import com.lois.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    void save(Account account);
}
