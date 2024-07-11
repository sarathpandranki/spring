package com.neoteric.tdd.bank.service;

import com.neoteric.tdd.bank.model.Account;

public class PassbookService {

    public void printPassbook(Account account) {

        System.out.println("Passbook updated: Account " + account.getAccountNumber() + " has balance " + account.getBalance());
    }
}
