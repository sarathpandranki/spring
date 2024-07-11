package com.neoteric.tdd.bank.service;

import com.neoteric.tdd.bank.model.Account;

public class AccountService {
    private final PassbookService passbookService;


    public AccountService(PassbookService passbookService) {
        this.passbookService = passbookService;
    }

    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        passbookService.printPassbook(account);
    }

    public void withdraw(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            passbookService.printPassbook(account);
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }
}
