package com.neoteric.tdd.service;

import com.neoteric.tdd.bank.model.Account;
import com.neoteric.tdd.bank.service.AccountService;
import com.neoteric.tdd.bank.service.PassbookService;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)

public class AccountServiceTest {
    @Mock
    private PassbookService passbookService;

    @InjectMocks
    private AccountService accountService;




    @Test
    public void testDeposit() {

        Account account = new Account("123456", 1000.0);

        accountService.deposit(account, 500.0);


        verify(passbookService, times(1)).printPassbook(account);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account("123456", 1000.0);

        accountService.withdraw(account, 500.0);


        verify(passbookService, times(1)).printPassbook(account);
    }



}
