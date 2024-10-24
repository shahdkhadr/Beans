package com.example.bean;

public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void serveAccount() {
        System.out.println("Account service is working with repository: " + accountRepository);
    }
}
